package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        /*
        Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
        Return the kth positive integer that is missing from this array.

        Example 1:
        Input: arr = [2,3,4,7,11], k = 5
        Output: 9
        Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
         */

        int[] arr = {2,3,4,7,11};
        int k = 5;

        int ans = kthElement(arr, k);
        System.out.println("K: " + ans);

        System.out.println("----------------------------------------");
        // ✅ Example from problem
        testCase(new int[]{2, 3, 4, 7, 11}, 5, 9);

        // ✅ Edge Case 1: Smallest input (arr starts from 1, k = 1)
        testCase(new int[]{1}, 1, 2);
        // Missing numbers: [2, 3, 4,...] → 1st missing = 2

        // ✅ Edge Case 2: Array doesn’t start at 1
        testCase(new int[]{3, 4, 5}, 2, 2);
        // Missing numbers: [1, 2, 6, 7,...] → 2nd missing = 2

        // ✅ Edge Case 3: Large gap at start
        testCase(new int[]{10, 11, 12}, 5, 5);
        // Missing numbers: [1, 2, 3, 4, 5, 6, 7,...] → 5th missing = 5

        // ✅ Edge Case 4: k larger than array size
        testCase(new int[]{2, 3, 4}, 7, 10);
        // Missing numbers: [1, 5, 6, 7, 8, 9, 10...] → 7th missing = 10

        // ✅ Edge Case 5: Continuous array, no gaps
        testCase(new int[]{1, 2, 3, 4, 5}, 3, 8);
        // Missing numbers: [6, 7, 8, 9...] → 3rd missing = 8
    }

    static int kthElement(int[] arr, int k) {
        ArrayList<Integer> missingElementArr = new ArrayList<Integer>();
        int start = 1;

        for (int i = 0; missingElementArr.size() <= k; i++) {
        boolean isPresent = false;
            for (int value : arr) {
                if (value == start) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) missingElementArr.add(start);
            start++;
        }

        System.out.println(missingElementArr);

        return missingElementArr.get(k-1);
    }
    static void testCase(int[] arr, int k, int expected) {
        int result = kthElement(arr, k);
        System.out.println("Array: " + Arrays.toString(arr) + ", k=" + k);
        System.out.println("Result: " + result + " | Expected: " + expected);
        System.out.println(result == expected ? "✅ Passed\n" : "❌ Failed\n");
        System.out.println("----------------------------------------");

    }
}
