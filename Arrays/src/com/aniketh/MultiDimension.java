package com.aniketh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
              1 2 3
              4 5 6
              7 8 9
         */

//        int[][] arr = new int[3][];// Here it is mandatory to give row value at the first bracket but column is not necessary.

//
//
        int[][] arr = new int[3][3];
//        Scanner in = new Scanner(System.in);
//        System.out.println(arr.length); // It will give me the output of rows length.

        //input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            }
            //output
//            for (int row = 0; row < arr.length; row++) {
//                // for each col in every row
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col] + " ");
//                }
//                System.out.println();
////                }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }




    }
}
