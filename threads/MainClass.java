package threads;

public class MainClass {

	public static void main(String[] args) {
		Thread thread = new Thread() {

			@Override
			public void run() {
				System.out.println("Hello there!");
			}
			
		};
		
		thread.start();

	}

}
