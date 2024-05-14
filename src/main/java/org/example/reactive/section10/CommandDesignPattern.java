package org.example.reactive.section10;

import org.example.reactive.section10.command.AC;
import org.example.reactive.section10.command.ACAutomationRemote;
import org.example.reactive.section10.command.IncrementACTemperatureCommand;
import org.example.reactive.section10.command.StartACCommand;

public class CommandDesignPattern {
    public static void main(String[] args) {

        AC acRoomOne = new AC();
        AC acRoomTwo = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(new StartACCommand(acRoomOne));
        remote.buttonPressed();

        remote.setCommand(new StartACCommand(acRoomTwo));
        remote.buttonPressed();

        remote.setCommand(new IncrementACTemperatureCommand(acRoomOne));
        remote.buttonPressed();
    }
}
