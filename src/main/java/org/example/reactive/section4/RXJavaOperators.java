package org.example.reactive.section4;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

import java.util.List;

public class RXJavaOperators {

    // SUPPRESSING OPERATORS

    // filter - accepts a predicate for given observable, and either passes or discards events

    // take
    //      } - captures specified number of emitions from upstream and emits
    // skip

    //distinct - suppress the duplicates | emits unique emission

    //elementAt - used to get element present at specified index

    //  TRANSFORMING OPERATORS

    // transforms the emissions
    // type of returned observable may not be the same

    // .map(Function mapper)

    // map(e -> e.someOperation())

    // Observable<T>.map() -> Observable<R>

    // Observable<T>.cast() -> Observable<R>

    // map() - takes a function that changes the type of input to some other specific type
    //pega uma função que muda o tipo de entrada para algum outro tipo específico

    // cast() - takes class name as argument
    //leva o nome da classe como argumento

    // delay() - delay the emission with specified amount of time
    // atrasar a emissão com um período de tempo especificado

    // delaySubscription - delay subscription with specified amount of time
    // atrasar a assinatura com um período de tempo especificado

    // scan() - takes accumulator function and apply to the first item and feeds result to next
    //pega a função de acumulador e aplica ao primeiro item e alimenta o resultado para o próximo

    // sorted - sorts upstream emissions
    // classifica as emissões a montante

    // repeat() - that repeats subscription specified number of items
    // que repete o número especificado de itens da assinatura

    // REDUCING OPERATORS

    // takes a series of emission and reduce them into single emission
    // works with finite observables

    // pega uma série de emissões e as reduz em uma única emissão
    // trabalha com observáveis finitos

    // Observable<T>.count() -> Single<T>

    // count() - counts the number of emissions in upstream
    // calcula o número de emissões a montante

    // reduce() - identical to scan but emits the final accumulation
    // idêntico ao scan, mas emite o acúmulo final

    // contains() - check whether the specified element is emitted from the upstream or not
    // verifica se o elemento especificado é emitido do upstream ou não

    // all() - verifies that each emission is satisfying the specified condition or not
    // verifica se cada emissão está satisfazendo a condição especificada ou não

    // any() - verifies whether any of emission is satisfying the specified condition or not
    // verifica se alguma das emissões está satisfazendo a condição especificada ou não

    // COLLECTION OPERATORS

    // - combine all the emissions from upstream to some collection
    // reduce emissions to a single collection
    // combinar todas as emissões de upstream para alguma coleta
    // reduz as emissões para uma única coleção

    //Observable<T>.toList() -> Single<List<Observable<T>>>

    // toList() - combine upstream emissions into a List and emits entire list in a Single emission
    // combina as emissões a montante em uma lista e emite a lista inteira em uma única emissão

    // toSortedList() - combine upstream emissions into a sorted List
    // combina emissões a montante em uma lista ordenada

    // toMap() - collect upstream emissions into a Map
    // coleta emissões a montante em um mapa

    // collect() - take emissions into any type of collection that we want
    // leva as emissões para qualquer tipo de coleta que quisermos


    //ERROR RECOVERY OPERATORS

    // Used to handle the errors and to recover from them
    // Usado para lidar com os erros e se recuperar deles

    // onError() - Communicates error to observer directly
    // Comunica o erro diretamente ao observador

    // onErrorReturnItem() - return some default element when exception occurs
    //retorna algum elemento padrão quando ocorrer uma exceção

    // onErrorReturn() - takes lambda to yeld defalt element
    // leva lambda para gerar o elemento padrão

    // onErrorResumeNext() - emit multiple values of single when exception occurs
    //emite vários valores de single quando ocorrer uma exceção

    // retry - re-subscribes to the observable hoping that it will complete without any error
    // assina novamente o observável esperando que ele seja concluído sem nenhum erro

    // ACTION OPERATORS

    // we can peek into observable chain at some particular event, to know whats happening
    // podemos espiar a cadeia observável de algum evento específico, para saber o que está acontecendo
    // doOnNext()
    // doOnError()
    // doOnSubscribe()
    // doOnComplete()
    //

}
