package com.aniketh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // In Java, Functions are knows as methods.
        // Q: Take an input of two numbers and print the sum.
        // In coding world, Dry means don't repeat yourself.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);

    }
}
