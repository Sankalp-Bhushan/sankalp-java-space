package SystemDesign.BehaviouralDesignPattern.ObserverPattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String videoTitle);
}
