package org.example.functional.section8.techniques.chaining;

import java.util.function.Consumer;
import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {

        IConsumer<String> ic1 = System.out::println;
        IConsumer<String> ic2 = System.out::println;

        //ic1.accept("Hello");
        //ic2.accept("Hello ic2");

        IConsumer<String> ic3 = s -> {
            ic1.accept(s);
            ic2.accept(s);
        };

        ic3.accept("Hello");

        IConsumer<String> ic4 = ic1.thenAccept(ic2);
        ic4.accept("BasicsStrong");

        Function<Integer, Integer> sumToTwo = s -> s+2;
        Function<Integer, Integer> multiplyToTwo = s -> s*2;
        Function<Integer, Integer> f3 = sumToTwo.andThen(multiplyToTwo);
        System.out.println(f3.apply(10));



        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;
        Consumer<String> c3 = c2.andThen(c1);
        c3.accept("hello c3");
        //c1.accept("Hello c1");



    }
}
