package org.example.builderPattern;

import org.example.builderPattern.Pizza;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("large")
                .setCheese(true)
                .setPepperoni(true)
                .setBacon(false)
                .setMushrooms(true)
                .build();

        System.out.println(pizza);

        // Another pizza with different options
        Pizza smallVeggiePizza = new Pizza.Builder("small")
                .setCheese(true)
                .setMushrooms(true)
                .setOnions(true)
                .build();

        System.out.println(smallVeggiePizza);
    }
}