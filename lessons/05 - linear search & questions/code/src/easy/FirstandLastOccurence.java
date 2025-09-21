package easy;

import java.util.Arrays;

public class FirstandLastOccurence {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,4,5,5,5,5,5,6,8,9,12};
        int target = 5;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int search(int[] nums, int target, boolean FindFirst){
        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                ans = mid;
                if(FindFirst) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
