package org.example.reactive.section10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDesignPattern {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ron");
        list.add("Shiva");

        Iterator<String> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            System.out.println("Name : " + listIterator.next());
        }

        System.out.println("Concrete iterator we get is: " + listIterator.toString());

        Set<String> set = new HashSet<>();
        set.add("setTom");
        set.add("setJohn");
        set.add("setRon");
        set.add("setShiva");

        Iterator<String> setIterator = set.iterator();

        while (setIterator.hasNext()) {
            System.out.println("Name : " + setIterator.next());
        }

        System.out.println("Concrete iterator we get is: " + setIterator.toString());


    }
}
