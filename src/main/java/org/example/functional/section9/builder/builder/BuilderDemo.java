package org.example.functional.section9.builder.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        Mobile mobile = new Mobile.MobileBuilder().with(
                builder -> {
                    builder.ram = 8;
                    builder.battery = 6000;
                    builder.camera = 16;
                    builder.processor = "A12 Bionic";
                }).build();

        System.out.println(mobile);
    }

}
