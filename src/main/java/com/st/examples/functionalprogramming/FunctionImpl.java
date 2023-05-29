package com.st.examples.functionalprogramming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionImpl {
    public static void main(String[] args) {
        //List.of(1,2,3,4).forEach(n -> incrementByOne(n));
        //List.of(1,2,3,4).forEach(FunctionImpl::incrementByOne);
        List<Integer> intList = List.of(1,2,3,4)
                .stream()
                //.map(n -> incrementByOne(n)) or
                .map(FunctionImpl::incrementByOne)
                .collect(Collectors.toList());

        //System.out.println(incrementByOne(1));
        //System.out.println(incrementByOneFunc.apply(2));
        System.out.println(incrementByOneFunc.andThen(doubleFunc).apply(1));
        //System.out.println(intList);
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n +1;

    static Function<Integer, Integer> doubleFunc = n -> n * 2;

    static int incrementByOne(int n){
        return n +1;
    }
}
