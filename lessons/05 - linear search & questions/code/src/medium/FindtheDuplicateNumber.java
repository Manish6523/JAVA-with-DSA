package medium;

public class FindtheDuplicateNumber {
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

        int[] nums = {1,2,3,4,2,5,6};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        int duplicate = -1;
        while (start<=end){
            int mid = (start+end)/2;
            int count = 0;

            for(int n: nums){
                if(n<=mid){
                    count++;
                }
            }

            if(count <= mid){
                start = mid + 1;
            } else {
                duplicate = mid;
                end = mid - 1;
            }
        }
        return duplicate;
    }
}
