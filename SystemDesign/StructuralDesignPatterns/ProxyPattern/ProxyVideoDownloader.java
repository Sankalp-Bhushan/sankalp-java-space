package SystemDesign.StructuralDesignPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    private RealVideoDownloader realDownloader = new RealVideoDownloader();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public void downloadVideo(String videoUrl) {
        if (cache.containsKey(videoUrl)) {
            System.out.println("Fetching video from cache: " + videoUrl + "\n");
        } else {
            System.out.println("Cache miss! Downloading fresh copy...");
            realDownloader.downloadVideo(videoUrl);
            cache.put(videoUrl, "Cached Copy of " + videoUrl);
        }
    }
}