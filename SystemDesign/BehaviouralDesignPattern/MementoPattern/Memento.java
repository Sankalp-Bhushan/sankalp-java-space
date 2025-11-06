package SystemDesign.BehaviouralDesignPattern.MementoPattern;

// Memento class: stores the state of Originator
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
