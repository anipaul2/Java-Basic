package com.aniketh;

public class Shadowing {
    static int x = 90; // This will be shadowed at line 8.
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // Used a local scope
        System.out.println(x); // 40 // It's printing the local scope value now.
        // Scope will begin when a value is initialised.
        fun();

    }
    static void fun() {
        System.out.println(x); // It will print 90 because the x = 40 was in a local scope which can't be accessed here.
    }
}
