package com.company.proxy;

public interface ThirdPartyYoutubeLib {
    void listVideos();
    void getVideoInfo(String url);
    void downloadVideo(String url);
}
