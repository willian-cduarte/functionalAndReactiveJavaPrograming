package org.example.reactive.section3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class CreatingObserver {
    public static void main(String[] args) {

        Observable<String> source = Observable.just("Orange", "Black", "Read");

        source.subscribe(i ->
                System.out.println(i), Throwable::printStackTrace, () -> System.out.println("Completed!")
        );

        System.out.println();

        source.subscribe(i -> System.out.println(i), Throwable::printStackTrace);

        System.out.println();

        source.subscribe(i -> System.out.println(i));

        Observer<String> observer = new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println(" Subscribed is Disposed : " + d.isDisposed());

            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println("On Next : " + s);

            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("Error :" + e.getMessage());
                //e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed !");

            }
        };


        source.subscribe(observer);

        observer.onError(new RuntimeException("Oops!"));


    }
}
