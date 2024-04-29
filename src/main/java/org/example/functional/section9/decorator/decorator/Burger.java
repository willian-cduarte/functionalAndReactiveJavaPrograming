package org.example.functional.section9.decorator.decorator;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private final List<Ingredient> ingredients;

    public Burger() {
        this.ingredients = new ArrayList<>();
    }

    private Burger(List<Ingredient> ingredients) {
        this.ingredients = new ArrayList<>();
        this.ingredients.addAll(ingredients);
    }

    public Burger addBread() {
        this.ingredients.add(new Ingredient("bread", 1));
        return new Burger(this.ingredients);
    }
    public Burger addTomato() {
        this.ingredients.add(new Ingredient("tomato", 1));
        return new Burger(this.ingredients);
    }

    public Burger addLettuce() {
        this.ingredients.add(new Ingredient("lettuce", 1));
        return new Burger(this.ingredients);
    }
    public Burger addCheese() {
        this.ingredients.add(new Ingredient("cheese", 1));
        return new Burger(this.ingredients);
    }

    public Burger addHamburger() {
        this.ingredients.add(new Ingredient("hamburger", 1));
        return new Burger(this.ingredients);
    }

    public String getDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();
        descriptionBuilder.append("Burguer: \n");
        if (!ingredients.isEmpty())
            descriptionBuilder.append("  Ingredients: \n");
        for (Ingredient ingredient : ingredients) {
            descriptionBuilder.append(ingredient.toString());
        }
        return descriptionBuilder.toString();
    }

}
