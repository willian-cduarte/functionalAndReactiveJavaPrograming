package org.example.functional.section9.command;

public class CommandDesignDemo {
    public static void main(String[] args) {
        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(ac1::turnOn);
        remote.buttonPressed();

        remote.setCommand(ac2::turnOn);
        remote.buttonPressed();

        remote.setCommand(ac1::decTemp);
        remote.buttonPressed();
    }
}
