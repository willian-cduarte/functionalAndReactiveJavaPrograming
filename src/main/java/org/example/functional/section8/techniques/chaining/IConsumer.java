package org.example.functional.section8.techniques.chaining;

import java.util.Objects;

@FunctionalInterface
public interface IConsumer<T> {

    void accept(T t);

    default IConsumer<T> thenAccept(IConsumer<T> next) {
        Objects.requireNonNull(next);

        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
