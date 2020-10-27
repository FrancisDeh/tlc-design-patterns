package com.company.command;

public class GarageOpenCommand implements Command {

    Garage garage;
    public GarageOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        this.garage.open();
    }
}
