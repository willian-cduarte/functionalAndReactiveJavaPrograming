package org.example.reactive.section10.decorator;

public class BarbecueBurgerDecorator extends BurgerDecorator {
    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegetables and cheese added.");
    }
}
