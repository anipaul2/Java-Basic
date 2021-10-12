package com.aniketh;

//import sun.swing.MenuItemLayoutHelper;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 45, 67, 89, 88};
        System.out.println(max(arr));

    }
    // Work on edge cases like array being null.
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];

            }

        }
        return maxVal;

    }
    }