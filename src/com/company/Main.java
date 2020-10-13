package com.company;

import com.company.bridge.*;

public class Main {

    public static void main(String[] args) {
        // create a tv
        Device tv = new Tv();
        //create the remote control with Tv to control
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();
        remoteControl.channelUp();
        remoteControl.volumeDown();
        remoteControl.togglePower();

        //create a radio
        Device radio = new Radio();
        //create a remote control with  the Radio to complete
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.togglePower();
        advancedRemoteControl.mute();
    }
}
