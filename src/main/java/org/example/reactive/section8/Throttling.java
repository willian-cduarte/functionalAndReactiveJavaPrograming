package org.example.reactive.section8;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Throttling {

    public static void main(String[] args) {

        Observable<String> observable = Observable.create(emitter -> {
            emitter.onNext("A");

            threadSleep(200);
            emitter.onNext("B");

            threadSleep(100);
            emitter.onNext("C");

            threadSleep(400);
            emitter.onNext("D");

            threadSleep(300);
            emitter.onNext("E");

            threadSleep(800);
            emitter.onNext("F");

            threadSleep(900);
            emitter.onNext("X");

            threadSleep(600);
            emitter.onNext("Y");

            threadSleep(1000);
            emitter.onNext("Z");

            emitter.onComplete();
        });

        /*observable.throttleFirst(1000, TimeUnit.MILLISECONDS)
                .subscribe(
                        item -> System.out.println("onNext: " + item),
                        Throwable::printStackTrace,
                        () -> System.out.println("onComplete")
                );*/

        /*observable.sample(1000, TimeUnit.MILLISECONDS)
                .subscribe(
                        item -> System.out.println("onNext: " + item),
                        Throwable::printStackTrace,
                        () -> System.out.println("onComplete")
                );*/

        /*observable
                .debounce(700, TimeUnit.MILLISECONDS)
                .subscribe(
                        item -> System.out.println("onNext: " + item),
                        Throwable::printStackTrace,
                        () -> System.out.println("onComplete")
                );*/

        observable.throttleWithTimeout(700, TimeUnit.MILLISECONDS)
                .subscribe(
                        item -> System.out.println("onNext: " + item),
                        Throwable::printStackTrace,
                        () -> System.out.println("onComplete")
                );
    }

    private static void threadSleep(int timeMillis) throws InterruptedException {
        Thread.sleep(timeMillis);
    }
}
