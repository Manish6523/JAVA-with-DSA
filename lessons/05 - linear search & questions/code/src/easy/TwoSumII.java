package easy;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        /*
        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
        Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
        The tests are generated such that there is exactly one solution. You may not use the same element twice.
        Your solution must use only constant extra space.

        Example 1:
        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
         */

        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr, target)));
        // Test case 2
        int[] arr2 = {2, 3, 4};
        int target2 = 6;
        System.out.println("Case 2: " + Arrays.toString(sum(arr2, target2))); // [1, 3]

        // Test case 3
        int[] arr3 = {-1, 0};
        int target3 = -1;
        System.out.println("Case 3: " + Arrays.toString(sum(arr3, target3))); // [1, 2]

        // Test case 4
        int[] arr4 = {1, 3, 4, 5, 7, 10, 11};
        int target4 = 9;
        System.out.println("Case 4: " + Arrays.toString(sum(arr4, target4))); // [3, 5] (4 + 5)

        // Test case 5
        int[] arr5 = {1, 2, 3, 4, 5};
        int target5 = 8;
        System.out.println("Case 5: " + Arrays.toString(sum(arr5, target5))); // [3, 5] (3 + 5)
    }

    static int[] sum(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }

        return result;
    }
}
