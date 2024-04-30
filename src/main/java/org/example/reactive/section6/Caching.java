package org.example.reactive.section6;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class Caching {

    public static void main(String[] args) throws InterruptedException {

        @NonNull
        Observable<@NonNull Long> src = Observable.interval(1, TimeUnit.SECONDS).cache();

        src.subscribe(e -> System.out.println("Observer 1 : " + e));
        Thread.sleep(5000);

        src.subscribe(e -> System.out.println("Observer 2 : " + e));
        Thread.sleep(3000);


    }
}
