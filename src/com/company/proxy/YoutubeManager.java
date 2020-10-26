package com.company.proxy;

public class YoutubeManager {

    public static void main(String[] args) {
        // using only the third party library
        ThirdPartyYoutubeClass thirdPartyYoutubeClass = new ThirdPartyYoutubeClass();
        thirdPartyYoutubeClass.listVideos();
        thirdPartyYoutubeClass.listVideos();
        thirdPartyYoutubeClass.getVideoInfo("Boss Baby");
        thirdPartyYoutubeClass.getVideoInfo("Boss Baby");
        thirdPartyYoutubeClass.downloadVideo("Rango");
        thirdPartyYoutubeClass.downloadVideo("Rango");

        System.out.println("------------------------------");

        //using custom built library that implements cache - proxy in action
        ThirdPartyYoutubeClass thirdPartyYoutubeClass1 = new ThirdPartyYoutubeClass();
        CachedYoutubeClass cachedYoutubeClass = new CachedYoutubeClass(thirdPartyYoutubeClass1);
        cachedYoutubeClass.listVideos();
        cachedYoutubeClass.listVideos();
        cachedYoutubeClass.getVideoInfo("Boss Baby 2");
        cachedYoutubeClass.getVideoInfo("Boss Baby 2");
        cachedYoutubeClass.downloadVideo("Rango");
        cachedYoutubeClass.downloadVideo("Rango");
    }
}
