package SystemDesign.BehaviouralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private final List<Observer> subscribers;
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println(observer + " has subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println(observer + " has unsubscribed from " + channelName);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        System.out.println("\n[" + channelName + "] Uploaded a new video: " + videoTitle);
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }

    // Helper method to simulate upload
    public void uploadVideo(String title) {
        notifyObservers(title);
    }

    @Override
    public String toString() {
        return "Channel: " + channelName;
    }
}