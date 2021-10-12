package com.aniketh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        // Arrays are displayed by indexes

        int[] arr = {1, 2, 8, 5, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums) {
        nums[0] = 99;// If you make a change to the object via this reference variable, same object will be changed.

    }
}
