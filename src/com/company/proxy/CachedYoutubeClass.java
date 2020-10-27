package com.company.proxy;

import java.util.ArrayList;
import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeClass service;
    private List<String> cachedVideoList = new ArrayList<>();
    private List<String> cachedDownloadList = new ArrayList<>();

    public CachedYoutubeClass(ThirdPartyYoutubeClass thirdPartyYoutubeClass) {
        this.service = thirdPartyYoutubeClass;
    }


    @Override
    public void listVideos() {
        if (this.cachedVideoList.isEmpty()) {
            this.service.listVideos();
            this.cachedVideoList.add("Boss Baby");
        } else {
            System.out.println("loading videos from cache");
        }
    }

    @Override
    public void getVideoInfo(String url) {
        if (this.cachedVideoList.contains(url)) {
            System.out.println("getting video info " + url + " from cache");
        } else {
            this.service.getVideoInfo(url);
            this.cachedVideoList.add(url);
        }
    }

    @Override
    public void downloadVideo(String url) {
        if (this.cachedDownloadList.contains(url)) {
            System.out.println("getting downloaded video " + url + " from cache");
        } else {
            this.service.downloadVideo(url);
            this.cachedDownloadList.add(url);
        }
    }
}
