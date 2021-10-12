package com.aniketh;

public class SearchInStrings {
    public static void main(String[] args) {
        // We can use charAt method to find a particular array size.
        String name = "Aniketh";
        char target = 'i';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;

        }
        return true;
    }
}
