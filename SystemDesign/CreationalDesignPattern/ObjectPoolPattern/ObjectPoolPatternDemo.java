package SystemDesign.CreationalDesignPattern.ObjectPoolPattern;

public class ObjectPoolPatternDemo {
    public static void main(String[] args) {

        ObjectPool pool = new ObjectPool();

        // Acquire 3 objects
        Reusable obj1 = pool.acquireReusable();
        obj1.doWork();

        Reusable obj2 = pool.acquireReusable();
        obj2.doWork();

        Reusable obj3 = pool.acquireReusable();
        obj3.doWork();

        pool.printPoolStatus();

        // Release one back to the pool
        pool.releaseReusable(obj1);
        pool.printPoolStatus();

        // Acquire again - should reuse released object
        Reusable obj4 = pool.acquireReusable();
        obj4.doWork();

        pool.printPoolStatus();
    }
}
