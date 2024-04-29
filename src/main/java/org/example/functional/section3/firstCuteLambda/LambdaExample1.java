package org.example.functional.section3.firstCuteLambda;

public class LambdaExample1 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 Executed!");
            }
        });
        t2.start();

        Thread t3 = new Thread(() ->  System.out.println("Thread3 Executed!"));
        t3.start();
    }
}