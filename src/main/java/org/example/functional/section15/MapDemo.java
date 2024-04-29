package org.example.functional.section15;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nikhil");
        map.put(2, "Sourabh");
        map.put(3, "Alex");
        map.put(5, "Shawn");
        map.put(100, "Justin");

       System.out.println(map);

       MapFun<Integer, String> mapFun = new MapFun<>(5);
        mapFun.put(1, "Nikhil");
        mapFun.put(2, "Sourabh");
        mapFun.put(3, "Alex");
        mapFun.put(5, "Shawn");
        mapFun.put(100, "Justin");

        mapFun.display();
    }
}
