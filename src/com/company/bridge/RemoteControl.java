package com.company.bridge;

public class RemoteControl {
     final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }

        System.out.println("Device is " + (this.device.isEnabled() ? " enabled." : " disabled"));
    }

    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
        System.out.println("Device volume increased to " + this.device.getVolume());
    }

    public void volumeDown(){
        this.device.setVolume(this.device.getVolume() - 1);
        System.out.println("Device volume decreased to " + this.device.getVolume());
    }

    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
        System.out.println("Device channel set to " + this.device.getChannel());
    }

    public void channelDown() {
        this.device.setChannel(this.device.getChannel() - 1);
        System.out.println("Device channel set to " + this.device.getChannel());
    }
}
