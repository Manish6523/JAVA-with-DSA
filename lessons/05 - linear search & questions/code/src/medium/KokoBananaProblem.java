package medium;

public class KokoBananaProblem {
    public static void main(String[] args) {
        /*
        Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
        Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
        Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
        Return the minimum integer k such that she can eat all the bananas within h hours.

        Example 1:
        Input: piles = [3,6,7,11], h = 8
        Output: 4
         */

        // Test Case 1 (LeetCode Example)
        int[] arr1 = {30,11,23,4,20};
        int hrs1 = 6;
        System.out.println(minEatingSpeed(arr1, hrs1)); // Expected: 4

    }

    static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];

        for(int n : piles){
            if (n>end){
                end = n;
            }
        }
        int ans = end;

        while (start<=end){
            long count = 0;
            int mid = start + (end - start) / 2;

            for(int b : piles){
                count += (b + (long) mid - 1) / mid;
            }
            if(count<=h){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans; // both start and end are same.
    }
}
