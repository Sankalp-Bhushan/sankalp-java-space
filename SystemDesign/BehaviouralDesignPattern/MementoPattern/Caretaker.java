package SystemDesign.BehaviouralDesignPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

// Caretaker: manages the list of mementos
public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
