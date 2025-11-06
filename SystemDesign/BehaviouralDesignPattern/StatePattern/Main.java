package SystemDesign.BehaviouralDesignPattern.StatePattern;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        System.out.println("=== First Transaction ===");
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();

        System.out.println("\n=== Second Transaction ===");
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();

        System.out.println("\n=== Try After Sold Out ===");
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();
    }
}
