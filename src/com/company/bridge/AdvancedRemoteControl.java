package com.company.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        super.device.setVolume(0);
        System.out.println("Device Muted. Volume is " + super.device.getVolume());
    }
}
