package org.example.reactive.section10.decorator;

public class PlainBurger implements Burger {
    @Override
    public void makeBurger() {
        System.out.println("Plain Burger is ready.");
    }
}
