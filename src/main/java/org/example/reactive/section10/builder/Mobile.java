package org.example.reactive.section10.builder;

public class Mobile {

    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String metalCase;



    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setMetalCase(String metalCase) {
        this.metalCase = metalCase;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public String getWireless() {
        return wireless;
    }

    public String getScreen() {
        return screen;
    }

    public String getMetalCase() {
        return metalCase;
    }

    public String toString() {
        return String.format("Mobile [memory = %s, batery= %s, wireless= %s, screen= %s, metalCase= %s",
                memory, battery, wireless, screen, metalCase);
    }

    public Mobile() {

    }

}
