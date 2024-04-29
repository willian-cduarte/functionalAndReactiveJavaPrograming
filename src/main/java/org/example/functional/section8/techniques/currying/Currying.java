package org.example.functional.section8.techniques.currying;

import java.time.LocalDateTime;
import java.util.function.Function;

public class Currying {

    public static void main(String[] args) {

        long start = LocalDateTime.now().getNano();
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function1 = u -> v -> w -> u + v + w;
        Function<Integer, Function<Integer, Integer>> function2 = function1.apply(1);
        Function<Integer, Integer> function3 = function2.apply(2);
        Integer sum = function3.apply(3);
        long end = LocalDateTime.now().getNano();

        System.out.println(sum);
        System.out.println(end - start);

        System.out.println("-");

        long startSum = LocalDateTime.now().getNano();
        Integer sumF = sumf(1,2,3);

        long endSum = LocalDateTime.now().getNano();

        System.out.println(sumF);
        System.out.println(endSum - startSum);

    }

    static Integer sumf(Integer a, Integer b, Integer c) {
        return a + b + c;
    }
}
