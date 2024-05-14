package org.example.reactive.section10;

import org.example.reactive.section10.strategy.CompressToRar;
import org.example.reactive.section10.strategy.Context;

public class StrategyDesignPattern {
    public static void main(String[] args) {

        Context context = new Context();
        context.setCompressionStrategy(new CompressToRar());
        context.generateFile("Abc.text");
    }
}
