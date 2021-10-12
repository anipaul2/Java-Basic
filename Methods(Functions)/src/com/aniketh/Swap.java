package com.aniketh;

public class Swap {
    public static void main(String[] args) {
        // Simple code to swap two numbers

//        int a = 10;
//        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b + " ");

        //Let's try the same code in functions or methods.
        int a = 10;
        int b = 20;
        swap(10, 20);

    }
    static void swap(int a, int b) {
        int temp = a;
         a = b;
         b = temp;
    }
}
