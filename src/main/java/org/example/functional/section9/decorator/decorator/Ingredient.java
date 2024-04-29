package org.example.functional.section9.decorator.decorator;

public class Ingredient {

    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "    " + name + " " + quantity + "\n";
    }
}
