package org.example.reactive.section10.decorator;

public abstract class BurgerDecorator extends PlainBurger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public void makeBurger() {
        burger.makeBurger();
    }
}
