package com.playground.fun.java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<String, Integer> length = s -> s.length();
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        Supplier<Double> piSupplier = () -> Math.PI;

        System.out.println(isEven.test(4)); // true
        System.out.println(length.apply("Java")); // 4
        printUpper.accept("hello"); // HELLO
        System.out.println(piSupplier.get()); // 3.141592...
    }
}