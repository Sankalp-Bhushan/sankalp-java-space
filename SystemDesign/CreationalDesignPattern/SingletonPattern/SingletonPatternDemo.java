package SystemDesign.CreationalDesignPattern.SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // Get first instance
        Singleton object1 = Singleton.getInstance();
        object1.showMessage();

        // Try getting another instance
        Singleton object2 = Singleton.getInstance();
        object2.showMessage();

        // Check if both instances are same
        System.out.println("Both objects are same? " + (object1 == object2));
    }
}
