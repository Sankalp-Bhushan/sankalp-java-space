package SystemDesign.StructuralDesignPatterns.ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        VideoDownloader downloader = new ProxyVideoDownloader();

        downloader.downloadVideo("https://youtube.com/watch?v=abc123");
        downloader.downloadVideo("https://youtube.com/watch?v=xyz456");

        // Same video request — should come from cache
        downloader.downloadVideo("https://youtube.com/watch?v=abc123");
    }
}