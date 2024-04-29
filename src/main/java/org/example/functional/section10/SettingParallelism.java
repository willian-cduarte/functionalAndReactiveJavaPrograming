package org.example.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime;
        long endTime;

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");

        System.out.println(ForkJoinPool.getCommonPoolParallelism());

        ForkJoinPool pool = new ForkJoinPool(5);

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Employee("John", 20000));
            list.add(new Employee("Rohn", 3000));
            list.add(new Employee("Tom", 15000));
            list.add(new Employee("Bheem", 8000));
            list.add(new Employee("Shiva", 200));
            list.add(new Employee("Krishna", 50000));
        }

        startTime = System.currentTimeMillis();
        System.out.println("Performing Sequentially: "+list.stream()
                .filter(e -> e.getSalary()> 1000)
                .count());

        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel : "+(endTime - startTime));

        startTime = System.currentTimeMillis();

        long count = pool.submit(() ->
                list.parallelStream()
                        .filter(e -> e.getSalary() > 1000)
                        .count()).get();

        System.out.println(count);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel : "+(endTime - startTime));
        //Computational Intensive

//		Number of threads <= number of cores

        //IO intensive

//		Number of threads > Number of cores
    }
}
