package Easy;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

        Example 1:

        Input: nums = [2,1,2]
        Output: 5
        Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
         */
        int[] a = {2,1,2};
        System.out.println(largestPerimeter(a));
    }

    static int largestPerimeter(int[] arr) {

        Arrays.sort(arr);

        for (int i = arr.length-1; i >=2; i--) {
            if (arr[i-1]+arr[i-2] > arr[i]){
                return arr[i-1]+arr[i-2] + arr[i];
            }
        }
        return 0;
    }
}
