package com.aniketh;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        String name = "Aniketh";

        // Scope basically means where we can access our variables.
//        System.out.print("The marks is: ");
//        random(20);

        // Continue from 50 minutes in kunal's video
        {
            a = 78; // Already initialised outside this block. Also here a can be reassigned and be printed too.
            name = "Ankit";
            System.out.println(name);
            System.out.println(a);

            // Values initialised in this block can be used in this block only.
            //Anything which is initialised outside can bs used but anything which is initialised inside cannot be used outside


        }
        System.out.println(a); // It will not print a because a is run outside the scope.
        System.out.println(name);

    }

    private static void random(int marks) {
        int num = 20;
//        System.out.println(num);
        System.out.println(marks);
    }
}
