package easy;

import java.util.Arrays;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        /*
        You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
        Return the index of the peak element.
        Your task is to solve it in O(log(n)) time complexity.

        Example 1:
        Input: arr = [0,1,0]
        Output: 1

        Example 2:
        Input: arr = [0,2,1,0]
        Output: 1
         */

        int[] arr ={4,5,6,7,8,9,0,1,2,3};

        System.out.println("Peak at index : " + peakmountaion(arr));
//        System.out.println(arr.length);

    }
    static int peakmountaion(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // peak is on the right
                start = mid + 1;
            } else {
                // peak is on the left (including mid)
                end = mid;
            }
        }
        return start; // or end (both meet at peak)
    }
}
