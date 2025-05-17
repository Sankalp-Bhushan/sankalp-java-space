package concurrency;

public class SubThreadClass extends Thread{

	@Override
	public void run() {
		System.out.println(ThreadColor.ANSI_BLUE + " Hello from the subclass thread.");
	}
	
}
