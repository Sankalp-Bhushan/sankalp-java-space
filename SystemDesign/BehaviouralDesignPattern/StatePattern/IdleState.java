package SystemDesign.BehaviouralDesignPattern.StatePattern;

public class IdleState implements VendingState {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted successfully.");
        machine.setMachineState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert a coin first.");
    }
}
