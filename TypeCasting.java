package com.aniketh;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   //     float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);
//        int num = (int)(67.58f);
//        System.out.println(num); //Typecasting means compressing the bigger number into a smaller number.
        // The above code converts the float to a integer which is only possible using brackets.


        // Automatic type promotions in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d =  a * b / c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number); //Java follows the unicode principles.

//        System.out.println(3 * 5.6387648736f);// integer * float  = float
//       System.out.println(3 * 3);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result  = (f * b) + (i / c) - (d * s);
        // float + integer - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
