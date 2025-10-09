package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesinanArray {
    public static void main(String[] args) {
        /*
        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
        You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]

        Example 2:
        Input: nums = [1,1,2]
        Output: [1]
         */
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length) {
                // value = idx - 1; [ if elem is 3 TF it should be at idx 2 ]
                int correctIdx = nums[i]-1;

                if (nums[i] != nums[correctIdx]) {
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = temp;
                } else {
                    i++;
                }
        }
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx+1){
                ans.add(nums[idx]);
            }
        }
        return ans;
    }
}
