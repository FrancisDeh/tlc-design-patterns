package com.company;

import com.company.bridge.*;
import com.company.proxy.CachedYoutubeClass;
import com.company.proxy.ThirdPartyYoutubeClass;

public class Main {

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

        // create a tv
        Device tv = new Tv();
        //create the remote control with Tv to control
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();
        remoteControl.channelUp();
        remoteControl.volumeDown();
        remoteControl.togglePower();

        System.out.println();

        //create a radio
        Device radio = new Radio();
        //create a remote control with  the Radio to complete
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.togglePower();
        advancedRemoteControl.mute();
    }
}
