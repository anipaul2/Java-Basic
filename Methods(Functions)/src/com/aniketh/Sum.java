package com.aniketh;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();// Here sum is the name of the function and () means calling the function.
//        System.out.println(ans);
        int ans = sum3(20, 30); // Here "a:" and "b:" is the intellij ide editor. Please don't use it in other compiler.
        System.out.println(ans);

    }
    // Pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }

    //Return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
        // Here return value means the function is over.

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }

}
