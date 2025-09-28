package medium;

public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        /*
        You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
        Return the single element that appears only once.
        Your solution must run in O(log n) time and O(1) space.

        Example 1:
        Input: nums = [1,1,2,3,3,4,4,8,8]
        Output: 2
         */

        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;

            // check that mid is always even.
            if (mid%2 == 1){
                mid--;
            }

            if (nums[mid] == nums[mid+1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
