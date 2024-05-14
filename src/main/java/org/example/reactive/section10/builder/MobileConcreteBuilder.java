package org.example.reactive.section10.builder;

public class MobileConcreteBuilder extends MobileBuilder {
    @Override
    public void createMemory() {
        getMobile().setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("6000 mAh");
        System.out.println("Battery created and installed");

    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Bluetooth and WiFi");
        System.out.println("Created wireless features and installed");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Amoled");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        getMobile().setMetalCase("Aluminium");
        System.out.println("MetalCase created and installed");
    }
}
