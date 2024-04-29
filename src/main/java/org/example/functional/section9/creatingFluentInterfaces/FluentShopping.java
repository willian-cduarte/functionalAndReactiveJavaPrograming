package org.example.functional.section9.creatingFluentInterfaces;

public class FluentShopping {
    public static void main(String[] args) {
        Order.place(order -> order
                .add("shoes")
                .add("Headphones")
                .deliverAt("Street no 45, Jodhpur")
        );
    }
}
