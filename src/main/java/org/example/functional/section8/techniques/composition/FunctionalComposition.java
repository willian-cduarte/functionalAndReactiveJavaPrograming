package org.example.functional.section8.techniques.composition;

import java.util.function.Function;

public class FunctionalComposition {

    public static void main(String[] args) {

        IFunction<Square, Integer> ifun1 = s -> s.getArea();
        IFunction<Integer, Double> ifun2 = area -> Math.sqrt(area);

        IFunction<Square, Double> getSide = ifun2.compose(ifun1);

        Square is = new Square();
        is.setArea(100);

        Double side = getSide.apply(is);
        System.out.println(side);

        Function<Square, Integer> function1 =  s -> s.getArea();
        Function<Integer, Double> function2 = area -> Math.sqrt(area);

        Function<Square, Double> getSideF = function2.compose(function1);
        Square s = new Square();
        s.setArea(100);
        Double sideF = getSideF.apply(s);
        System.out.println(sideF);
    }
}
