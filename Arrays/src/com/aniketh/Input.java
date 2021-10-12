package com.aniketh;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Arrays of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 12;
//        arr[2] = 32;
//        arr[3] = 43;
//        arr[4] = 55;
        // [23, 12, 32, 43, 55];
//        System.out.println(arr[3]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();


        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Aniketh";
        System.out.println(Arrays.toString(str));
        //System.out.println(Arrays.toString(arr));
//        for (int num : arr) { // for every element in an array, print the element.
//            System.out.println(num + " "); // here num represents element of the array


        }
}
        //System.out.println(arr[5]); // Index out of bound of error.








