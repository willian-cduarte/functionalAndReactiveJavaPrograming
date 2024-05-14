package org.example.reactive.section11;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {

        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> list = new ArrayList<>();

        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(10.5));

        List<Box<Integer>> boxList = new ArrayList<>();
        boxList.add(new Box<>(List.of(1,2,3)));
        boxList.add(new SquareBox<>(List.of(7,8,9)));



    }
}
