package org.example.functional.section5;

//GenericFunctionalInterfaces

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> fun = s -> s.substring(1, 5);
        System.out.println(fun.execute("BasicStrong"));

        FunctionalGenerics<String, Integer> funInt = String::length;
        System.out.println(funInt.execute("BasicStrong"));

    }
}
