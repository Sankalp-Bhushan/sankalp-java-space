package SystemDesign.BehaviouralDesignPattern.StatePattern;

public class WorkingState implements VendingState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted. Please wait...");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.releaseItem();
    }
}
