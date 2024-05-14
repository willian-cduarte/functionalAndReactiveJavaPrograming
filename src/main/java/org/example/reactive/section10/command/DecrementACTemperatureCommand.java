package org.example.reactive.section10.command;


public class DecrementACTemperatureCommand implements Command{


    AC ac;

    public DecrementACTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decrement temperature on the ac");
        ac.decTemp();
    }
}
