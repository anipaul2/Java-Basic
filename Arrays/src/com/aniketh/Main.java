package com.aniketh;

public class Main {

    public static void main(String[] args) {
        // Q to store a roll number
        //int a = 12;

        // Q/ To store a person's name
        String name = "Aniketh paul";

        //Array is a collection of datatype

//        int[] rnos = {1, 3, 5, 6, 7};
//        // Or directly you can write
//        int[] rnos2 = new int[5];
        // All the type of the data in an array should be same.

        int[] rno; // This is knows as declaration of an array. Here rno is getting defined in the stack.
        rno = new int[5]; // initialisation : Here actually object is being created in the heap memory.
        // In the above code "new" means to create an object.
        //In java there is no concept of pointers. It totally depends on JVM.
        // Array objects are in heap
        // heap objects are not continous
        // In java internally arrays may not be continous because it depends on JVM.
       // System.out.println(rno[0]);
        String[] arr = new String[4];
        System.out.println(arr[0]);
        // Null cannot be assigned to primitives.
        // Before writing an array start with "[]".
        //Primitives are int, char, boolean.
        // Non-primitives are complex datatypes.





    }
}
