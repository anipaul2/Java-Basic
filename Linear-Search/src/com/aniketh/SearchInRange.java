package com.aniketh;

public class SearchInRange {
    public static void main(String[] args) {
        // arr = [18, 12, -7, 3, 4, 28] which has indexes of 5
        // Q: Search for 3 in the range of index[1,4]
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;


            }
        }
        // This line will execute if none of the return statements above have expected
        // hence the target not found.
        return -1;


    }
}