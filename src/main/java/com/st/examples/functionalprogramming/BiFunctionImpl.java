package com.st.examples.functionalprogramming;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {

        Person praneeth = personMapper.apply("Praneeth", 37);
        System.out.println(praneeth);
    }

    record Person(String name, int age){}

    //static BiFunction<String, Integer, Person> personMapper = (name, age) -> new Person(name,age);
    static BiFunction<String, Integer, Person> personMapper = Person::new;

}
