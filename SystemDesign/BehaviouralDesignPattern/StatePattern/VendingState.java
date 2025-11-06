package SystemDesign.BehaviouralDesignPattern.StatePattern;

public interface VendingState {

	void insertCoin(VendingMachine product);

	void dispenseItem(VendingMachine product);

}