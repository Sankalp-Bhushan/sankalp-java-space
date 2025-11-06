package SystemDesign.BehaviouralDesignPattern.MementoPattern;

// Originator: the object whose state needs to be saved/restored
public class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Setting state to: " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Creates a memento to save the current state
    public Memento saveStateToMemento() {
        System.out.println("Saving state to Memento...");
        return new Memento(state);
    }

    // Restores state from a given memento
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Restored state from Memento: " + state);
    }
}
