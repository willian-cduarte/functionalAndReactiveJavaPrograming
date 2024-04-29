package org.example.functional.section3.functionalInterfaces;

public class LambdaUnderTheHood {

    public static void main(String[] args) {

        MyFunctionalInterface fun1 = new  MyFunctionalInterface() {

            @Override
            public void myMethod() {
                System.out.println("Implementation 1");
            }
        };

        MyFunctionalInterface fun2 = new  MyFunctionalInterface() {

            @Override
            public void myMethod() {
                System.out.println("Implementation 2");
            }
        };

        MyFunctionalInterface fun = () -> System.out.println("I am Light weight");
            fun.myMethod();
            fun1.myMethod();
            fun2.myMethod();

        };

}
