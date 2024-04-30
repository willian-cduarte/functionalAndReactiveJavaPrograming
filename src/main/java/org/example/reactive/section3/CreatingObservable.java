package org.example.reactive.section3;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingObservable {
    public static void main(String[] args) {

        //create
        Observable<Integer> source = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(10);
                    e.onNext(10);
                    e.onComplete();
                }
        );

        source.subscribe(System.out::println);

        //just
        Observable<Integer> just = Observable.just(1,2,3);

        just.subscribe(System.out::println);

        //fromIterable
        //List<String> list = Arrays.asList("Ram", "Shyam", "Mike");
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");

        Observable<String> src = Observable.defer(
                () -> Observable.fromIterable(list)
        );
        System.out.println();
        System.out.println("Observable.defer(() -> Observable.fromIterable(list))");
        System.out.println("src.subscribe");

        src.subscribe(System.out::println);

        System.out.println("add Rahin");
        list.add("Rahin");

        System.out.println("src.subscribe");
        src.subscribe(System.out::println);

        System.out.println();
        System.out.println("Observable.fromIterable");

        Observable<String> fromIterable = Observable.fromIterable(list);
        System.out.println("fromIterable.subscribe");

        fromIterable.subscribe(System.out::println);

        System.out.println("add Mike");
        list.add("Mike");

        System.out.println("fromIterable.subscribe");
        fromIterable.subscribe(System.out::println);

    }

}
