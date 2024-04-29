package org.example.functional.section15;

import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        ListFun<Integer> list = ListFun.list(3,6,9);
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("addElement(56)");
        ListFun<Integer> newList = list.addElement(56);
        newList.forEach(System.out::println);

        System.out.println();
        System.out.println("removeElement(Integer.valueOf(9)");
        ListFun<Integer> removeElement = newList.removeElement(Integer.valueOf(9));
        removeElement.forEach(System.out::println);

        System.out.println();
        System.out.println("reverseList");
        ListFun<Integer> reverseList = removeElement.reverseList();
        reverseList.forEach(System.out::println);

        ListFun<Integer> list1 = ListFun.list(3, 6, 9, 8);
        ListFun<Integer> list2 = ListFun.list(35, 78, 90);

        System.out.println();
        System.out.println("concat");
        ListFun<Integer> concatList = ListFun.concat(list1, list2);
        concatList.forEach(System.out::println);

        System.out.println();
        System.out.println("list1.addAllElements(l)");
        List<Integer> l = List.of(2, 5, 8, 6);
        list1.addAllElements(l).forEach(System.out::println);
    }
}
