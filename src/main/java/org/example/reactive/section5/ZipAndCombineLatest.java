package org.example.reactive.section5;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ZipAndCombineLatest {
    public static void main(String[] args) throws InterruptedException {

        Observable<Long> src1 = Observable.interval(200, TimeUnit.MILLISECONDS).take(10);
        Observable<Long> src2 = Observable.interval(1, TimeUnit.SECONDS).take(10);

        Observable.combineLatest(src1, src2, (e1, e2) -> "Souce 1 : " + e1 + " Source 2 : " + e2)
                .subscribe(System.out::println);

        Thread.sleep(20000);


    }
}
