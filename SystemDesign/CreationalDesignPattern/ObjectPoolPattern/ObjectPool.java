package SystemDesign.CreationalDesignPattern.ObjectPoolPattern;

import java.util.HashSet;
import java.util.Set;

// Generic Object Pool implementation
public class ObjectPool {

    private final Set<Reusable> available = new HashSet<>();
    private final Set<Reusable> inUse = new HashSet<>();
    private int counter = 0;
    private final int MAX_POOL_SIZE = 3;

    // Get an object from the pool
    public synchronized Reusable acquireReusable() {
        if (!available.isEmpty()) {
            Reusable instance = available.iterator().next();
            available.remove(instance);
            inUse.add(instance);
            System.out.println("Reusing existing object ID: " + instance.getId());
            return instance;
        }

        if (counter < MAX_POOL_SIZE) {
            Reusable newInstance = new Reusable(++counter);
            inUse.add(newInstance);
            return newInstance;
        }

        throw new RuntimeException("No objects available in pool! Try releasing some objects.");
    }

    // Return an object back to the pool
    public synchronized void releaseReusable(Reusable instance) {
        if (inUse.remove(instance)) {
            available.add(instance);
            System.out.println("Object ID " + instance.getId() + " released back to pool.");
        }
    }

    // For debugging
    public synchronized void printPoolStatus() {
        System.out.println("Available: " + available.size() + " | In Use: " + inUse.size());
    }
}
