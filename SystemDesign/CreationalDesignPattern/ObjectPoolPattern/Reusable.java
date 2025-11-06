package SystemDesign.CreationalDesignPattern.ObjectPoolPattern;

// A simple class representing the object we want to pool
public class Reusable {

    private final int id;

    public Reusable(int id) {
        this.id = id;
        System.out.println("Created new Reusable object with ID: " + id);
    }

    public void doWork() {
        System.out.println("Reusable object " + id + " is working...");
    }

    public int getId() {
        return id;
    }
}
