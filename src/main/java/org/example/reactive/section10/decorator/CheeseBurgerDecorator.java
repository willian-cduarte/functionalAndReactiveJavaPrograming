package org.example.reactive.section10.decorator;

public class CheeseBurgerDecorator extends BurgerDecorator {

    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", cheese added.");
    }
}
