package org.example.functional.section3.functionalInterfaces;

public class FunctionalInterfaces1 {

    public static void main(String[] args) {

        MyFunctionalInterface fun = () -> System.out.println("hello");
        fun.myMethod();

        Integer x = 100;

        onTheFly(() -> System.out.println("hello"));
    }

    public static void onTheFly(MyFunctionalInterface fun) {
        fun.myMethod();
    }
}
