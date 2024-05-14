package org.example.reactive.section11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {

        //System.out.println(methodOne(10));

        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(12);
        arrayList.add(true);
        arrayList.add("Hello");
        System.out.println(arrayList);
    }

    public static String methodOne(Integer a) {
        List<String> l = new LinkedList<String>();
        List b = l;
        b.add(a);
        return (String) l.iterator().next();
    }

   // public static void methodTwo(ArrayList<String> strings) {}
    public static void methodTwo(ArrayList<Integer> integers) {}
}
