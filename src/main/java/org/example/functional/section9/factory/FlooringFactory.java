package org.example.functional.section9.factory;

import java.util.function.Supplier;

public class FlooringFactory {
    public static Flooring getFlooring(int minTemperature, int maxTemperature) {
        Supplier<Flooring> flooring;

        if (minTemperature <= 5 && maxTemperature <= 20)
            flooring = WoodenFlooring::new;
        else if (minTemperature <=5 && maxTemperature >=45)
            flooring = ConcreteFlooring::new;
        else
            flooring = ConcreteFlooring::new;

        return flooring.get();
    }
}
