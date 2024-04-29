package org.example.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObservingTheStream {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        List<Book> collect = books.stream()
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() > 3)
                .toList();

        //1.Source
        Stream<Book> stream = books.stream();

        //2. Intermediate Operation
        Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));


        //3. Intermediate Operation
        Stream<Book> pHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);

        //4. Terminal operation
        List<Book> collected = pHorrorBooks.toList();
    }
}
