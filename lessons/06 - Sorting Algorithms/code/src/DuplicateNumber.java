import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        /*
        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        There is only one repeated number in nums, return this repeated number.
        You must solve the problem without modifying the array nums and using only constant extra space.

        Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2

        Example 2:
        Input: nums = [3,1,3,4,2]
        Output: 3
         */
        int a = findDuplicate(new int[]{1, 3, 4, 2, 3});
        System.out.println("--> "+a);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i+1 ){
                // value = idx - 1; [ if elem is 3 TF it should be at idx 2 ]
                int correctIdx = nums[i]-1;

                if (nums[i] != nums[correctIdx]) {
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
