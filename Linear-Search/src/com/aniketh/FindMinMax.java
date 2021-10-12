package com.aniketh;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 4, 28};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }

    // Let's assume that the first value of the array is our ans
     //We have to find the minimum value in an array.
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];

            }

        }
        return ans;


    }

    static int max(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > answer) {
                answer = arr[i];

            }

        }
        return answer;
    }

}