package Easy;

import java.util.Arrays;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        /*
        Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

        Example 1:
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]

        Example 2:
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
         */
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] freq01 = new int[nums1[nums1.length-1]+1];
        int[] freq02 = new int[nums2[nums2.length-1]+1];


        for (int k : nums1) {
            freq01[k] += 1;
        }

        for (int k : nums2) {
            freq02[k] += 1;
        }

        int size = 0;
        for (int i = 0; i < 1001; i++) {
            size += Math.min(freq01[i], freq02[i]); // count of intersection elements
        }
        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(freq01));
        System.out.println(Arrays.toString(freq02));
        System.out.println("-------------------------------------");

        int[] ans = new int[size];
        int idx = 0;
        for (int i = 0; i < 1001; i++) {
            int count = Math.min(freq01[i], freq02[i]);
            for (int j = 0; j < count; j++) {
                ans[idx++] = i;
            }
        }
        return ans;
    }
}
