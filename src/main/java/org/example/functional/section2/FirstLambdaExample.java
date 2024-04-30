package org.example.functional.section2;

public class FirstLambdaExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread executed"));
        t.start();
    }
}
