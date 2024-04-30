package org.example.reactive.section1.observer;

public class ObserverDesignPattern {
    public static void main(String[] args) {

        Book book = new Book("Goosebumps", "Horror", "Xyz", 200, "SoldOut");

        EndUser bob = new EndUser("Bob", book);
        EndUser rob = new EndUser("Rob", book);
        EndUser rooney = new EndUser("Rooney", book);

        System.out.println(book.getInStock());

        book.setInStock("In Stock");
    }
}
