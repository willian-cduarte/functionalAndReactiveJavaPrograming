package org.example.reactive.section11;

public class LinkedListDemo {
    public static void main(String[] args) {

        DataNode<Integer> node1 = new DataNode<>(20,null);
        DataNode<Integer> node2 = new DataNode<>(35,node1);
        DataNode<Integer> node3 = new DataNode<>(40,node2);
        DataNode<Integer> node4 = new DataNode<>(45,node3);
        DataNode<Integer> node5 = new DataNode<>(55,node4);


        System.out.println(node1.toString());
        System.out.println(node2.toString());
        System.out.println(node3.toString());
        System.out.println(node4.toString());
        System.out.println(node5.toString());
    }
}
