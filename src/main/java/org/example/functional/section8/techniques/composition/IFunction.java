package org.example.functional.section8.techniques.composition;

public interface IFunction<T, R> {

    R apply(T t);

    default <V> IFunction<V, R> compose(IFunction<V, T> before) {
        return (V v) -> apply(before.apply(v));
    }
}
