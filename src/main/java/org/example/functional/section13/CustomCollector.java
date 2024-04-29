package org.example.functional.section13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollector {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,6,8,9,0,1,52,5,61,8,9,96,0,18,23);

        Collector<Integer, List<Integer>, List<Integer>> toCustomList =
                Collector.of(
                        ArrayList::new,
                        List::add,
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        },
                        Collector.Characteristics.IDENTITY_FINISH
                );

        List<Integer> events = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(toCustomList);

        events.forEach(System.out::println);
        System.out.println(events);
        System.out.println("----------------");

        Collector<Integer, List<Integer>, List<Integer>> toSortedListCollector =
                Collector.of(
                        ArrayList::new,
                        List::add,
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        },
                        Collector.Characteristics.UNORDERED
                );

        List<Integer> sortedList = numbers.stream()
                .collect(toSortedListCollector);
        System.out.println(sortedList);
        System.out.println(numbers.stream().sorted().collect(toSortedListCollector));


    }
}
