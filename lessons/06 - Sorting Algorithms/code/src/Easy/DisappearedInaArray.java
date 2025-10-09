package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedInaArray {
    public static void main(String[] args) {
        /*
        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]

         */
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while (i < nums.length) {
            // value = idx - 1; [ if elem is 3 TF it should be at idx 2 ]
            int correctIdx = nums[i] - 1;

            if (nums[i] != nums[correctIdx]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                ans.add(j+1);
            }
        }

        return ans ;
    }
}
