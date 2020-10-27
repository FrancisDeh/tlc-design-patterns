package com.company.command;

public class PlayGround {

    public static void main(String[] args) {

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Garage garage = new Garage();
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garage);

        Switch aSwitch = new Switch();
        aSwitch.setCommand(lightOnCommand);
        aSwitch.pressButton();

        aSwitch.setCommand(lightOffCommand);
        aSwitch.pressButton();

        aSwitch.setCommand(garageOpenCommand);
        aSwitch.pressButton();
    }
}
