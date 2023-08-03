package com.st.examples.sand;

import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void main(String[] args) {

        listOf();

    }

    static void bar(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
    static void listOf(){
        List<String> list = List.of("1","2","3","null");
        System.out.println(list);
        //list.remove(2);
        System.out.println(list);
    }
}
