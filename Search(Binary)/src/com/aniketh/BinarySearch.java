package com.aniketh;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    // Return the index
    // Return -1 if it does not exist

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //Find the middle element
        //

        while (start <= end) {

//            int mid = (start + end) / 2; // It will not work because if middle value exceeds the int size datatype in java then it will show error.
            int mid  = start + ( end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                end = mid + 1;
            } else {
                // answer found
                return mid;

            }
        }
        return -1;
    }
}
