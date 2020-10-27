package com.company.command;

public class Switch {

    Command command;

    public Switch() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
