package org.example.reactive.section11;

import java.util.ArrayList;

public class Behaviour {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("Strong");
        method(list);
        System.out.println(list);
    }

    public static void method(ArrayList list) {
        list.add(10);
        list.add("See this");
        list.add(true);
    }
}
