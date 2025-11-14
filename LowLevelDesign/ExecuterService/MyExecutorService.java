package LowLevelDesign.ExecuterService;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * https://chatgpt.com/share/690b9444-e418-8011-a3a8-f8005a1b57ba
 */
public class MyExecutorService {

	private final BlockingQueue<Runnable> taskQueue;
	private final List<Worker> workers;
	private volatile boolean isShutdown = false;

	public MyExecutorService(int numThreads) {
		taskQueue = new LinkedBlockingQueue<>();
		workers = new ArrayList<>();

		// Create and start worker threads
		for (int i = 0; i < numThreads; i++) {
			Worker worker = new Worker("Worker-" + i);
			worker.start();
			workers.add(worker);
		}
	}

	/**
	 * Submit a new task to be executed by the thread pool.
	 */
	public void submit(Runnable task) {
		if (!isShutdown) {
			taskQueue.offer(task);
		} else {
			throw new IllegalStateException("Executor already shutdown");
		}
	}

	/**
	 * Graceful shutdown — finish already queued tasks.
	 */
	public void shutdown() {
		isShutdown = true;
		for (Worker worker : workers) {
			worker.interrupt(); // wake up blocked workers if any
		}
	}

	/**
	 * Force shutdown — stop everything immediately.
	 */
	public void shutdownNow() {
		isShutdown = true;
		for (Worker worker : workers) {
			worker.stopWorker();
		}
		taskQueue.clear();
	}

	/**
	 * Worker class — each worker runs tasks from the queue.
	 */
	private class Worker extends Thread {

		private volatile boolean running = true;

		Worker(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (running) {
				try {
					Runnable task = taskQueue.take(); // blocks if empty
					task.run();
				} catch (InterruptedException e) {
					// Check for shutdown
					if (isShutdown)
						break;
				} catch (RuntimeException e) {
					System.err.println(getName() + " caught exception: " + e.getMessage());
				}
			}
			System.out.println(getName() + " exiting.");
		}

		void stopWorker() {
			running = false;
			this.interrupt();
		}
	}
}
