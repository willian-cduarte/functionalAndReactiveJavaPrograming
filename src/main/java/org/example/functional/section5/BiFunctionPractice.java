package org.example.functional.section5;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<String, String, String> stringBiFunction = (a, b) -> a + b;


        BiFunction<String, String, Integer> biFunction = (a,b) -> (a + b).length();

        System.out.println(stringBiFunction.apply("Basics", "Strong"));

        System.out.println(biFunction.apply("Basics", "Strong"));

    }
}
