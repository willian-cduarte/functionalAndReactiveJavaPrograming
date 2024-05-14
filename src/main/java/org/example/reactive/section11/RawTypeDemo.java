package org.example.reactive.section11;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {

        Box<Integer> genBox = new Box<>(List.of(1,2,3));

        for (Integer i: genBox.getList()){
            System.out.println(i);
        }

        Box rawBox = new Box(List.of(1,2,"basics"));

        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("setDryTrash");
        bin.setWetTrash(1);

        System.out.println("Dry trash: " + bin.getDryTrash() + ", Wet trash: " + bin.getWetTrash());
    }
}
