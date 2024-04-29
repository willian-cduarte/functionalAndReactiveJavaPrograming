package org.example.functional.section9.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new Object[]{1,2,3,4,5});
        myArrayList.forEach(System.out::println);

        ArrayList arrayList = new ArrayList(List.of(new Object[]{1, 2, 3, 4, 5}));
        arrayList.forEach(System.out::println);
    }


}
