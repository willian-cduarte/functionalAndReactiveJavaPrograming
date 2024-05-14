package org.example.reactive.section10;

import org.example.reactive.section10.decorator.BarbecueBurgerDecorator;
import org.example.reactive.section10.decorator.Burger;
import org.example.reactive.section10.decorator.CheeseBurgerDecorator;
import org.example.reactive.section10.decorator.PlainBurger;

public class DecoratorDesignPattern {
    public static void main(String[] args) {

        Burger burger = new PlainBurger();
        burger.makeBurger();

        new CheeseBurgerDecorator(burger).makeBurger();
        new BarbecueBurgerDecorator(burger).makeBurger();
    }
}
