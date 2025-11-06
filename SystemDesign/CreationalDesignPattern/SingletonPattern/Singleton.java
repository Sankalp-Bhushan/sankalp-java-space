package SystemDesign.CreationalDesignPattern.SingletonPattern;

/**
 * Singleton class ensures only one instance is created throughout the application.
 * 
 * Thread-safe implementation with lazy initialization and double-checked locking.
 */
public class Singleton {

    // Volatile ensures visibility of changes across threads
    private static volatile Singleton instance;

    // Private constructor prevents instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Global access point
    public static Singleton getInstance() {
        if (instance == null) { // first check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }
}
