package com.st.examples.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Pr","Bh","Ya","Sr");

        //Consumer<String> stringConsumer = name -> System.out.println(name);
        //names.forEach(stringConsumer);

        //Method Reference
        //System.out::println is MethodReference (Double colon::). In this below case (methodReference) we are not allowed to change the data of names.
        Consumer<String> stringConsumer2 = System.out::println;
        names.forEach(System.out::println);
    }
}
