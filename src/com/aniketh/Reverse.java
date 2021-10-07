package com.aniketh;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // We have to reverse a number.
        // number = 23597 and ans = 79532
        //Scanner in = new Scanner(System.in);
        int n = 23597;
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of the given number is " + reverse);
    }
}
