package org.example.functional.section8;

public class Demo {
    public static void main(String[] args) {

        int sumResult = add(multiply(2, 3) , multiply(3,4));
        System.out.println(sumResult);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a * b;
    }

    public static void log(String s) {
        System.out.println(s);
    }
}
