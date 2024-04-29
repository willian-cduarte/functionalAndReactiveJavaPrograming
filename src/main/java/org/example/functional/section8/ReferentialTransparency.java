package org.example.functional.section8;

public class ReferentialTransparency {
    public static void main(String[] args) {

        int sumResult = add(2, multiply(2,  multiply(2, 2)));
        System.out.println(sumResult);

    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int multiply(int a, int b) {
        System.out.println("Multiplying a and b :" +a+ ", "+b);
        System.out.println(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a*b;
    }
}
