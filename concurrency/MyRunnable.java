package concurrency;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from my runnable implementation of runnable.");
	}

}
