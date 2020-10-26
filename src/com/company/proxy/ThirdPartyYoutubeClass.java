package com.company.proxy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public void listVideos() {
        System.out.println("loading videos from youtube api");
    }

    @Override
    public void getVideoInfo(String url) {
        System.out.println("getting video info " + url + " from youtube api");
    }

    @Override
    public void downloadVideo(String url) {
        System.out.println("downloading video " + url + " from youtube api");
    }
}
