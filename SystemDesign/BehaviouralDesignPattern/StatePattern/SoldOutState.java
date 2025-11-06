package SystemDesign.BehaviouralDesignPattern.StatePattern;

public class SoldOutState implements VendingState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is sold out. Cannot accept coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No items available to dispense.");
    }
}
