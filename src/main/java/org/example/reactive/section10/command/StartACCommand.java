package org.example.reactive.section10.command;


public class StartACCommand implements Command{

    AC ac;

    public StartACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning on the ac");
        ac.turnOn();
    }
}
