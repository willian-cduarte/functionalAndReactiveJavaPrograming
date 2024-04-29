package org.example.functional.section11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Characteristics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(1);

        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        int bits = spliterator.characteristics();
        System.out.println(bits);
        System.out.println(Integer.bitCount(bits));

        //OR

        System.out.println(Integer.bitCount(bits | 0x00000010));
        System.out.println(Integer.bitCount(bits | Spliterator.ORDERED));
        System.out.println(Integer.bitCount(bits | Spliterator.SORTED));

        //And

        System.out.println(bits & 0x00000010);

        System.out.println(spliterator.hasCharacteristics(0x00000010));

        long count = list.stream().filter(x -> {
            System.out.println("mapping " + x);
            return x == x * 2;
        }).count();

        System.out.println(count);

        /*List<Integer> orderedList = list.stream()
                .sorted().toList();

        System.out.println(orderedList);*/
//		//e.g
		Stream<Integer> integerStream = Stream.of(1,3,2,4,9)//ORDERED, SIZED
		.filter(i->i%2==0) // ORDERED
		.sorted() // ORDERED, SORTED
		.map(i->i+1) // ORDERED
		.unordered(); //

        System.out.println(integerStream.toList());

        Set<Integer> integerSet = new HashSet<>(list);

        SortedSet<Integer> integerSortedSet = new TreeSet<>(list);
        Integer lastInt = integerSortedSet.last();
        System.out.println(lastInt);

        System.out.println(integerSet.stream().findFirst().get());


        System.out.println(list);
        System.out.println(integerSet);
        System.out.println(integerSortedSet);

    }
}
