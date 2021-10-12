package com.aniketh;

public class Overloading {
    public static void main(String[] args) {
        // When there is two functions with same name but different arguments, it can be called.
//        op(24);
//        fun("Aniketh");
        int ans = sum(12, 45, 67);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;

    }
    static int sum(int a, int b, int c) {
        return a+ b + c;
    }



    static void op(int a) {
        System.out.println("First one");
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
