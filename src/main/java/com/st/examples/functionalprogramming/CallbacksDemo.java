package com.st.examples.functionalprogramming;

import java.util.function.Consumer;

public class CallbacksDemo {
    public static void main(String[] args) {
        hello("Praneeth", null, cb);
    }

    static Consumer<String> cb = input -> System.out.println(input + " you must have last name");
    static void hello(String firstName,
                      String lastName,
                      Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }
}
