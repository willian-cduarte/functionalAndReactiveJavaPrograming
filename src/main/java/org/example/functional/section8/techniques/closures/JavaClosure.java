package org.example.functional.section8.techniques.closures;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class JavaClosure {
    public static void main(String[] args) {
        int val = 111;

        //val = 112;

        Task lambda = () -> {
            //val = 112;
            System.out.println(val);
            System.out.println("TASK COMPLETED");
        };

        printValue(lambda);

    }

    private static void printValue(Task lambda) {
        lambda.doTask();
    }
}
