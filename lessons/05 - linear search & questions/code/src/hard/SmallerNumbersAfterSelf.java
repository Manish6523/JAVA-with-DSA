package hard;

import java.util.ArrayList;
import java.util.List;

public class SmallerNumbersAfterSelf {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

        Example 1:

        Input: nums = [5,2,6,1]
        Output: [2,1,1,0]

        Explanation:
        To the right of 5 there are 2 smaller elements (2 and 1).
        To the right of 2 there is only 1 smaller element (1).
        To the right of 6 there is 1 smaller element (1).
        To the right of 1 there is 0 smaller element.
         */
        int[] que = {5,2,6,1};
        System.out.println(countSmaller(que));
    }
    static List<Integer> countSmaller(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();

        for (int i = nums.length-1; i >= 0 ; i--) {
            int idx = sp(sorted, nums[i]);
            sorted.add(idx,nums[i]);
            ans.add(idx);
        }
        return ans.reversed();
    }

    static int sp(ArrayList<Integer> arr, int value) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) { // use <= to include end element
            int mid = start + (end - start) / 2; // safer than (start+end)/2
            if (arr.get(mid) == value) {
                return mid; // value found, return its index
            } else if (arr.get(mid) < value) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        // if not found, start will be the correct insertion index
        return start;
    }

}
