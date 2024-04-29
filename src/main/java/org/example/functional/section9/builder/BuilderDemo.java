package org.example.functional.section9.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        MobileBuilder mobileBuilder = new MobileBuilder();

        Mobile mobile = mobileBuilder.with(builder -> {
            builder.ram = 8;
            builder.battery = 6000;
            builder.camera = 16;
            builder.processor = "A12 Bionic";
        }).createMobile();

        System.out.println(mobile);
    }
}
