package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	public static final String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<String>();
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		ReentrantLock bufferLock = new ReentrantLock();
		MyProducer myProducer = new MyProducer(buffer, MyProducer.class.getName(), bufferLock);
		MyConsumer myConsumer1 = new MyConsumer(buffer, MyConsumer.class.getName() + " 1 :", bufferLock);
		MyConsumer myConsumer2 = new MyConsumer(buffer, MyConsumer.class.getName() + " 2 :", bufferLock);
		
		executorService.execute(myProducer);
		executorService.execute(myConsumer1);
		executorService.execute(myConsumer2);
		
		executorService.shutdown();

//		new Thread(myProducer).start();
//		new Thread(myConsumer1).start();
//		new Thread(myConsumer2).start();
	}

}

class MyProducer implements Runnable {
	private List<String> buffer;
	private String threadName;
	ReentrantLock bufferLock;

	public MyProducer(List<String> buffer, String threadName, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.threadName = threadName;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		Random random = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(threadName + " Adding " + num);
				bufferLock.lock();
				try {
					buffer.add(num);
				} finally {
					bufferLock.unlock();
				}

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Producer was interrupted.");
			}
		}
		System.out.println(threadName + " Adding EOF and Exiting...");
		bufferLock.lock();
		try {
			buffer.add(ProducerConsumer.EOF);
		} finally {
			bufferLock.unlock();
		}

	}

}

class MyConsumer implements Runnable {
	private List<String> buffer;
	private String threadName;
	ReentrantLock bufferLock;

	public MyConsumer(List<String> buffer, String threadName, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.threadName = threadName;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		while (true) {
			bufferLock.lock();
			try {
				if (buffer.isEmpty()) {
					continue;
				}
				if (buffer.get(0).equals(ProducerConsumer.EOF)) {
					System.out.println(threadName + " Exiting...");
					break;
				} else {
					System.out.println(threadName + " Removed " + buffer.remove(0));
				}
			} finally {
				bufferLock.unlock();
			}
		}
	}

}