package hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        /*
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example 1:
        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example 2:
        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
         */
        System.out.println( "median : " + findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    static String findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = merge(nums1, nums2);
        Arrays.sort(mergedArr);
        double median;
        int n = mergedArr.length;
        if (n%2==0) {
            median = (mergedArr[n/2 - 1] + mergedArr[n/2])/2.0;
        } else {
            median =  mergedArr[n/2];
        }
        return String.format("%.5f", median);
    }

    static int[] merge(int[] nums1, int[] nums2){
        // merge 2 arrays
        int[] merge = new int[nums1.length + nums2.length];
        int idx = 0;

        for (int value : nums1){
            merge[idx++] = value;
        }
        for (int value : nums2){
            merge[idx++] = value;
        }
        return merge;
    }



}
