package org.example.reactive.section6;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;

import java.util.concurrent.TimeUnit;

public class SubjectTypes {

    public static void main(String[] args) throws InterruptedException {

        // Publish Subject
        //starts to emit the source observables itms from the moment observer subscribe to it
        //começa a emitir os itens observáveis ​​da fonte a partir do momento em que o observador se inscreve nele

        Subject<String> publishSubject = PublishSubject.create();
        publishSubject.subscribe(e -> System.out.println("PublishSubject Subscriber 1: " + e));

        publishSubject.onNext("a");
        publishSubject.onNext("b");
        publishSubject.onNext("c");

        publishSubject.subscribe(e -> System.out.println("PublishSubject Subscriber 2: " + e));

        publishSubject.onNext("d");
        publishSubject.onNext("e");
        publishSubject.onComplete();


        // Replay Subject
        // emits all the items of the source observable, regardless of when the subscriber subscribes
        // emite todos os itens da fonte observável, independentemente de quando o assinante assina

        Subject<String> replaySubject = ReplaySubject.create();
        replaySubject.subscribe(e -> System.out.println("ReplaySubject Subscriber 1: " + e));

        replaySubject.onNext("a");
        replaySubject.onNext("b");
        replaySubject.onNext("c");

        replaySubject.subscribe(e -> System.out.println("ReplaySubject Subscriber 2: " + e));

        replaySubject.onNext("d");
        replaySubject.onNext("e");
        replaySubject.onComplete();

        // Behavior Subject
        // Emits the most recent itemwith the subsequent items of the source observable from the point of subscription
        // Emite o item mais recente com os itens subsequentes da fonte observáveis ​​a partir do ponto de assinatura

        Subject<String> behaviorSubject = BehaviorSubject.create();
        behaviorSubject.subscribe(e -> System.out.println("BehaviorSubject Subscriber 1: " + e));

        behaviorSubject.onNext("a");
        behaviorSubject.onNext("b");
        behaviorSubject.onNext("c");

        behaviorSubject.subscribe(e -> System.out.println("BehaviorSubject Subscriber 2: " + e));

        behaviorSubject.onNext("d");
        behaviorSubject.onNext("e");
        behaviorSubject.onComplete();

        // Async Subject
        // Emits only the last value of the source observable
        // Emite apenas o último valor da fonte observável

        Subject<String> asyncSubject = AsyncSubject.create();
        asyncSubject.subscribe(e -> System.out.println("AsyncSubject Subscriber 1: " + e));

        asyncSubject.onNext("a");
        asyncSubject.onNext("b");
        asyncSubject.onNext("c");

        asyncSubject.subscribe(e -> System.out.println("AsyncSubject Subscriber 2: " + e));

        asyncSubject.onNext("d");
        asyncSubject.onNext("e");
        asyncSubject.onComplete();

        // Unicast Subject
        // Buffers all the emissions received by the sources, until an observer subscribes to it
        // Armazena todas as emissões recebidas pelas fontes, até que um observador assine

        Subject<String> unicastSubject = UnicastSubject.create();
        //unicastSubject.subscribe(e -> System.out.println("UnicastSubject Subscriber 1: " + e));

        unicastSubject.onNext("a");
        unicastSubject.onNext("b");
        unicastSubject.onNext("c");

        unicastSubject.subscribe(e -> System.out.println("UnicastSubject Subscriber 2: " + e));

        unicastSubject.onNext("d");
        unicastSubject.onNext("e");
        unicastSubject.onComplete();

        Subject<Long> longUnicastSubject = UnicastSubject.create();

        Observable.interval(500, TimeUnit.MILLISECONDS)
                .subscribe(longUnicastSubject);

        Thread.sleep(2000);

        longUnicastSubject.subscribe(e -> System.out.println("Long Unicast Subject Subscriber: " + e));

        Thread.sleep(2000);

        /*Subject<Long> unicastSubject = UnicastSubject.create();

        Observable.interval(500, TimeUnit.MILLISECONDS)
                .subscribe(unicastSubject);

        Thread.sleep(2000);


        Thread.sleep(2000);

        unicastSubject.onNext(1L);
        unicastSubject.onNext(2L);
        unicastSubject.onNext(3L);

        unicastSubject.subscribe(e -> System.out.println("Subscriber 2: " + e));

        unicastSubject.onNext(4L);
        unicastSubject.onNext(5L);
        unicastSubject.onComplete();*/
    }
}
