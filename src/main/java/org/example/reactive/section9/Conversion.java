package org.example.reactive.section9;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Conversion {

    // Flowable
    // - when source is emitting large amount od data
    // - hot observables emitting data endlessly
    // - Asynchronous source | Concurrent and parallel programing

    // - quando a fonte está emitindo uma grande quantidade de dados
    // - observáveis quentes emitindo dados indefinidamente
    // - Synchronous source | limited concurrent

    // Observable
    // - in case of fewer, steady, continuous emissions
    // - quick, less overhead

    // - no caso de emissões menores, constantes e contínuas
    // - rápido, menos sobrecarga

    public static void main(String[] args) throws InterruptedException {

        Observable.range(1, 1000)
                .toFlowable(BackpressureStrategy.BUFFER)
                .observeOn(Schedulers.io())
                .subscribe(e -> System.out.println(e + " Observable.toFlowable " + Thread.currentThread().getName()));

        Flowable.range(1, 1000)
                .toObservable()
                .observeOn(Schedulers.io())
                .subscribe(e -> System.out.println(e + " Flowable.toObservable " + Thread.currentThread().getName()));

        Thread.sleep(5000);

    }


}
