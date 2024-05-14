package org.example.reactive.section11;

import java.util.ArrayList;

public class JavaCollections {

    public static void main(String[] args) {

        // ClassCastException
        /*
        ArrayList list = new ArrayList();
        list.add("Jonh");
        list.add(1);

        for (Object o: list) {
            String str = (String) o;
        }
        */

        ArrayList<String> list = new ArrayList<>();
        list.add("Jonh");
        list.add("1");

        for (String string: list) {
            System.out.println(string);
        }

    }
}
