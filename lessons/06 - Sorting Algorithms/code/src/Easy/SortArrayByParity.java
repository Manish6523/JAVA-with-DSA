package Easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        /*
        Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
        Return any array that satisfies this condition.

        Example 1:
        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
         */

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] ans = sortArrayByParity(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortArrayByParity(int[] nums) {
        int[] arr = nums;

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            if(arr[start]%2 > arr[end]%2){
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            if (arr[start]%2 == 0) start++;
            if (arr[end]%2 == 1) end--;

        }


        return arr;
    }
}
