package SystemDesign.BehaviouralDesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {

        // Create a YouTube channel (Subject)
        YouTubeChannel channel = new YouTubeChannel("Tech Simplified");

        // Create subscribers (Observers)
        Subscriber s1 = new Subscriber("Sankalp");
        Subscriber s2 = new Subscriber("Akash");
        Subscriber s3 = new Subscriber("Riya");

        // Subscribers subscribe to the channel
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        // Upload a new video -> all subscribers notified
        channel.uploadVideo("Observer Design Pattern Explained");

        // One subscriber unsubscribes
        channel.unsubscribe(s2);

        // Upload another video -> only remaining subscribers notified
        channel.uploadVideo("State Design Pattern Made Easy");
    }
}
