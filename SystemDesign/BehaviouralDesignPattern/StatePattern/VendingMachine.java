package SystemDesign.BehaviouralDesignPattern.StatePattern;

public class VendingMachine {

    private VendingState machineState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        if (itemCount > 0) {
            machineState = new IdleState();
        } else {
            machineState = new SoldOutState();
        }
    }

    public void insertCoin() {
        machineState.insertCoin(this);
    }

    public void dispenseItem() {
        machineState.dispenseItem(this);
    }

    public VendingState getMachineState() {
        return machineState;
    }

    public void setMachineState(VendingState machineState) {
        this.machineState = machineState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void releaseItem() {
        if (itemCount > 0) {
            itemCount--;
            System.out.println("An item is released. Items left: " + itemCount);
        }
        if (itemCount == 0) {
            setMachineState(new SoldOutState());
        } else {
            setMachineState(new IdleState());
        }
    }
}
