package org.example.reactive.section8;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class WindowOperator {
    public static void main(String[] args) throws InterruptedException {

        // window
        //Buffer into other observables rather than collections
        //yelds observable of observables
        //emits emissions immediatly as soom they become available
        //Buffer em outros observáveis em vez de coleções
        //produz observável de observáveis
        //emite emissões imediatamente assim que ficam disponíveis

        //defining scope

        //window(int count)
        //window(long timespan)
        //window(Observable boundaryIndicator)

/*
        Observable.range(1, 30)
                .buffer(4, HashSet::new)
                .subscribe(System.out::println);
        */

        /*
        Observable.range(1, 30)
                .buffer(4, 5)
                .subscribe(System.out::println);
        */

        /*
        Observable.interval(500, TimeUnit.MILLISECONDS)
                .buffer(1, TimeUnit.SECONDS, 2)
                //.buffer(1, TimeUnit.SECONDS)
                .subscribe(System.out::println);
        */


        Observable<Long> interval = Observable.interval(500, TimeUnit.MILLISECONDS);
        Observable.interval(1000, TimeUnit.MILLISECONDS)
                .window(interval)
                .subscribe(e -> System.out.println(e));

        Thread.sleep(8000);

    }
}
