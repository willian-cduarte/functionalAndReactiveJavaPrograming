package org.example.reactive.section10.command;

public class IncrementACTemperatureCommand implements Command{
    AC ac;

    public IncrementACTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Increment temperature on the ac");
        ac.incTemp();
    }
}
