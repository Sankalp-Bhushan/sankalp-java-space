package SystemDesign.StructuralDesignPatterns.AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "believer.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "friends.vlc");
        audioPlayer.play("avi", "unknown.avi");
    }
}