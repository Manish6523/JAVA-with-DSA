package Easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        /*
        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

        Example 1:

        Input: nums = [3,0,1]
        Output: 2
        Explanation:
        n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
         */

        int[] arr = {3,0,1};
        cyclic(arr);
        int missingElem = missing(arr);
        System.out.println("Missing Element : " + missingElem);
    }
    static void cyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // value = idx ; [ if elem is 3 Therefore it should be at idx 3 also ]
            int correctIdx = nums[i];

            if (nums[i] > nums.length - 1){
                i++;
            } else if (nums[i] != nums[correctIdx]) {
                // swap
                swap(nums, i, correctIdx);
            } else i++;
        }
    }

    static int missing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
