package concurrency;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(ThreadColor.ANSI_PURPLE + " Hello from the main thread.");
		
		Thread subclassThread = new SubThreadClass();
		subclassThread.start();
		
		new Thread(){
			public void run(){
				System.out.println(ThreadColor.ANSI_GREEN + " Hello from the anonymous class thread");
			}
		}.start();
		
		Thread runnable = new Thread(new MyRunnable());
		runnable.start();

		System.out.println("Hello from main again.");
		
	}

}
