package org.example.reactive.section11;

public class JavaGenerics {

    //generics

    //type checking at compile time

    public static void main(String[] args) {
        Data<String> d1 = new Data<>("This is d1");
        System.out.println(d1.toString());

        Data<Integer> d2 = new Data<>(10);
        //int data = (int) d1.getData(); -> ClassCastException
        System.out.println(d2.toString());

        IData<String> d3 = new Data<>("We have implemented interface");
        System.out.println(d3.toString());

        // generic Type: generic class or generic Interface
    }
}
