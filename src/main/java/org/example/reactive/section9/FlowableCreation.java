package org.example.reactive.section9;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class FlowableCreation {
    public static void main(String[] args) throws InterruptedException {

        Flowable.create(emitter -> {
                            for (int i = 0; i <= 5000; i++) {
                                if (emitter.isCancelled())
                                    return;
                                System.out.println("emitter : " + i);
                                emitter.onNext(i);
                            }
                            emitter.onComplete();
                        },
                        BackpressureStrategy.BUFFER)
                .observeOn(Schedulers.io())
                .subscribe( e -> System.out.println("subscriber : " + e)
                );

        Thread.sleep(2000);
    }
}
