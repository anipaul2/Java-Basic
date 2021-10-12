package com.aniketh;
import java.util.Scanner;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String arr = in.nextLine();
//        in.close();
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(234);
        list.add(123);
        list.add(345);
        list.add(678);
        list.add(900); // We have assigned initial capacity of 10 integers but we can assign more.

        System.out.println(list);

        list.set(0, 99);
        list.remove(2);

        System.out.print(list);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println(list);

    }
}
