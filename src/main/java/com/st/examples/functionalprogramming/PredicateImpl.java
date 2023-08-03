package com.st.examples.functionalprogramming;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        String email = "p@p.com";



        System.out.println(atPredicate.or(dotPredicate).test(email));

    }

    static Predicate<String> atPredicate = email -> email.contains("@");
    static Predicate<String> dotPredicate = email -> email.contains(".");


}
