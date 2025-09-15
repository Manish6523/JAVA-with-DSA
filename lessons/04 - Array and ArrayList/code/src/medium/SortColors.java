package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        /*
            Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
            We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
            You must solve this problem without using the library's sort function.

            Example:
            Input: nums = [2,0,2,1,1,0]
            Output: [0,0,1,1,2,2]
        */
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(arr)));

    }
    static int[] sort(int[] arr){
//        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
