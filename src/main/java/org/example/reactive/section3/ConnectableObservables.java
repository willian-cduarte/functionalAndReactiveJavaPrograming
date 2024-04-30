package org.example.reactive.section3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class ConnectableObservables {
    public static void main(String[] args) throws InterruptedException {

        ConnectableObservable<@NonNull Long> source =
                Observable.interval(1, TimeUnit.SECONDS).publish();

        source.connect();

        source.subscribe(System.out::println);

        Thread.sleep(1000);

        source.subscribe(System.out::println);

        Thread.sleep(1000);

    }
}
