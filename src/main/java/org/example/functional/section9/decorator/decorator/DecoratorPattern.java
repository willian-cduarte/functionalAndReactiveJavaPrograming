package org.example.functional.section9.decorator.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        Burger myBurger = new BurgerShop(Burger::addBread)
                .use(new BurgerShop(Burger::addHamburger)
                        .use(new BurgerShop(Burger::addCheese)
                                .use(new BurgerShop(Burger::addTomato)
                                        .use(new BurgerShop(Burger::addLettuce)
                                                .use(new Burger())))));

        prepareBurger(myBurger);

    }

    static void prepareBurger(Burger burger) {
        System.out.println("Prepare " + burger.getDescription() );
    }
}
