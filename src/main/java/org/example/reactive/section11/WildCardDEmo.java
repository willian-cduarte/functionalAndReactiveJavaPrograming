package org.example.reactive.section11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardDEmo {

    /*public static void displayData(List<?> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }*/

    public static void displayData(List<? extends Number> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }

    /*public static void displayData(List<? super Integer> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }*/

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[] {2,5,3,8,9});
        List<Double> doubleList = Arrays.asList(new Double[] {9.3,2.5,5.7,8.5,9.8});

        List<?> list1 = new ArrayList<>();
        Number number = 2;
        Integer integer = 2;
        Double doubleN =  integer.doubleValue();

        List<? extends Number> list2 = new ArrayList<Number>();
        // list2.add(integer); // error

        List<? extends Number> list3 = new ArrayList<Integer>();
        // list3.add(integer); // error

        List<? extends Number> list4 = new ArrayList<Double>();
        // list4.add(doubleN); // error

        List<? super Integer> list5 = new ArrayList<Integer>();
        list5.add(integer);

        List<? super Integer> list6 = new ArrayList<Number>();
        list6.add(integer);

        List<? super Double> list7 = new ArrayList<Number>();
        list7.add(doubleN);


        displayData(list);
        displayData(doubleList);
    }
}
