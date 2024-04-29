package org.example.functional.section7;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("value");
        //Optional<String> optional = Optional.empty();

        //map
        String orElse = optional.map(val -> "replaced").orElse("empty");
        System.out.println(orElse);
        Optional<String> map = optional.map(val -> "replaced");
        System.out.println(map.get());

        //filter
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("value"));
        System.out.println(filter.get());

        //flatmap
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("replaced"));
        System.out.println(flatMap.get());

    }
}
