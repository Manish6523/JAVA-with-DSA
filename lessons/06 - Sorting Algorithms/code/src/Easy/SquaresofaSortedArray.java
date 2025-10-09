package Easy;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        /*
        Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

        Example 1:

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].

         */

        int[] a = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(a));

    }
    static int[] sortedSquares(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1]*arr[j-1] > arr[j]*arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            arr[arr.length-i-1] = arr[arr.length-i-1]*arr[arr.length-i-1];
            if (!isSwapped) {
                break;
            }
        }

        return arr;
    }

}
