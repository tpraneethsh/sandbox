package com.st.examples.util;

public class PrintOneToTenWitoutLoop {
    public static void print(int n) {
        if (n <= 10) {
            System.out.println(n);
            print(n + 1);//Recursive call
        }
    }

    public static void main(String[] args) {
        print(1);

    }
}
