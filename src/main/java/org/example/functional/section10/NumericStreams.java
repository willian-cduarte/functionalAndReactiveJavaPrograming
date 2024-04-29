package org.example.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        list.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        list.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        list.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        list.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        OptionalDouble average = list.stream()
                .mapToDouble(Book::getRating)
                .average();

        System.out.println(average.getAsDouble());

        //map : Objects

        //mapToDouble : primitive double

        IntStream intStream = IntStream.of(1,3,5,8);
        DoubleStream doubleStream = DoubleStream.of(1,3,5,8);
        LongStream longStream = LongStream.of(1L,3L,5L,8L);

        Stream<Integer> integerStream = intStream.boxed();
        Stream<Double> doubleStream1 = doubleStream.mapToObj(value -> value);

    }
}
