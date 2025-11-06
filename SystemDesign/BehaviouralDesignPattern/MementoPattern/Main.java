package SystemDesign.BehaviouralDesignPattern.MementoPattern;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento()); // save checkpoint 1

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento()); // save checkpoint 2

        originator.setState("State #4");
        System.out.println("\nCurrent State: " + originator.getState());

        // Restoring to previous states
        originator.getStateFromMemento(caretaker.get(0));
        originator.getStateFromMemento(caretaker.get(1));
    }
}
