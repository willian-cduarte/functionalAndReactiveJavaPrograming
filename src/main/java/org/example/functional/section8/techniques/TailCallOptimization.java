package org.example.functional.section8.techniques;

public class TailCallOptimization {
    public static void main(String[] args) {

        reFact(10);
        tailReFact(10, 2);

    }

    public static long reFact(int n) {
        if (n <= 1)
            return 1;
        else {
            System.out.println("refact " + n);
            return n * reFact(n-1);
        }

    }

    public static long tailReFact(int n, int a) {
        if (n <= 1)
            return a;
        else {
            System.out.println("tailReFact: n = " + n + ", a = " + a);
            return tailReFact(n - 1, n * a);
        }
    }
}
