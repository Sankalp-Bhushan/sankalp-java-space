package LowLevelDesign.ExecuterService;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyExecutorService executor = new MyExecutorService(3);

		for (int i = 1; i <= 10; i++) {
			int taskId = i;
			executor.submit(() -> {
				System.out.println(Thread.currentThread().getName() + " running task " + taskId);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			});
		}

		Thread.sleep(3000);
		executor.shutdown();

		System.out.println("Shutdown called.");
	}
}