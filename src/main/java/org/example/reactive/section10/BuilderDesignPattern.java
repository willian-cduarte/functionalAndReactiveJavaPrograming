package org.example.reactive.section10;

import org.example.reactive.section10.builder.Manufacturer;
import org.example.reactive.section10.builder.Mobile;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        Mobile mobile = Manufacturer.createCompleteObject();
        System.out.println(mobile);
    }
}
