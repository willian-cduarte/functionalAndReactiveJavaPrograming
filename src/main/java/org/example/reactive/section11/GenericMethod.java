package org.example.reactive.section11;

public class GenericMethod {

    public static <T> String concat(T data) {
        return "Data is : " + data;
    }

    public static void main(String[] args) {

        System.out.println(concat("basics"));
        System.out.println(concat(43));
    }
}
