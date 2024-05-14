package org.example.reactive.section10.command;


public class StopACCommand implements Command{

    AC ac;

    public StopACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning off the ac");
        ac.turnOff();
    }
}
