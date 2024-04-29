package org.example.functional.section5;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);
}
