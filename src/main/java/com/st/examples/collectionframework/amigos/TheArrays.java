package com.st.examples.collectionframework.amigos;

import java.util.ArrayList;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Red";
        colors[1] = "Blue";
        //System.out.println(Arrays.toString(colors));
        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
        /*for (String color: colors){
            System.out.println(color);
        }*/
        //Arrays.stream(colors).forEach(System.out::println);

        int[] numbers = {100,200};

    }
}
