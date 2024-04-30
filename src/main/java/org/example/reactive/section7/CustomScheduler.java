package org.example.reactive.section7;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomScheduler {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        @NonNull
        Scheduler scheduler = Schedulers.from(executorService);

        Observable<String> src = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .subscribeOn(scheduler)
                .doFinally(executorService::shutdown);

        src.subscribe(e -> compute(e));
        src.subscribe(e -> compute(e));
        src.subscribe(e -> compute(e));
        src.subscribe(e -> compute(e));
        src.subscribe(e -> compute(e));

        Thread.sleep(50000);
    }

    public static void compute(String s) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(s);
        System.out.println("Computation Done By : "+ Thread.currentThread().getName());
    }
}
