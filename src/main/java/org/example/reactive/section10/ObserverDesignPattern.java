package org.example.reactive.section10;

import org.example.reactive.section10.observer.Book;
import org.example.reactive.section10.observer.EndUser;
import org.example.reactive.section10.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesignPattern {
    public static void main(String[] args) {


        Book book = new Book("Goosebumps", "Horror", "Xyz", 200, "SoldOut");

        EndUser bob = new EndUser("Bob", book);
        EndUser rob = new EndUser("Rob", book);
        EndUser rooney = new EndUser("Rooney", book);

        ArrayList<Observer> subcribers = book.getObsList();

        for (Iterator<Observer> iterator = subcribers.iterator(); iterator.hasNext();) {
            EndUser endUser = (EndUser) iterator.next();
            System.out.println(endUser.getName() + " has subscribed for " + book.getName() + " Book");
        }

        System.out.println(book.getInStock());

        System.out.println("Book is now available");

        book.setInStock("Back in Stock");
    }
}
