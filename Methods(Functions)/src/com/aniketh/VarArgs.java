package com.aniketh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,5,6,7,8,40);
//        wow(24,45, "Bill Paul");
        demo(2,3,4,5);
        demo("Hello");


    }

    static void demo(int ...v) { // The function name is highlighted which means it's in used.
        System.out.println(Arrays.toString(v));



//    static void wow(int a, int b, String ...v) {
//        System.out.println(v);

    }

    static void demo (String ...v) {
        System.out.println(Arrays.toString(v));
    }


    static void fun(int ...a) { // Here "..." means array of integers or else it can take as many arguments as we want.
        System.out.println(Arrays.toString(a));


    }
}
