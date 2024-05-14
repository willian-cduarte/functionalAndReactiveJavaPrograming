package org.example.reactive.section11;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[] {2,5,3,8,9});
        List<Double> doubleList = Arrays.asList(new Double[] {9.3,2.5,5.7,8.5,9.8});

        DataSorter<Integer> sorterInt = new DataSorter<>(list);
        DataSorter<Double> sorterString = new DataSorter<>(doubleList);

        sorterInt.printSortedData();
        sorterString.printSortedData();

    }
}
