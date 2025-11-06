package SystemDesign.StructuralDesignPatterns.ProxyPattern;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public void downloadVideo(String videoUrl) {
        System.out.println("Connecting to YouTube...");
        simulateNetworkDelay();
        System.out.println("Downloading video from: " + videoUrl);
        System.out.println("Download complete.\n");
    }

    private void simulateNetworkDelay() {
        try {
            Thread.sleep(2000); // simulate time delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}