package org.example.functional.section9.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        Burger myBurger = new BurgerShop(burger -> burger.addCheese())
                .use(new BurgerShop(burger -> burger.addVeggies()).use(new Burger()));

        System.out.println("I get " + myBurger);

    }
}
