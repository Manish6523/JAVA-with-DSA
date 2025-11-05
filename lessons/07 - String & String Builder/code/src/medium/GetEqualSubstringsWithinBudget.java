package medium;

import java.util.Arrays;

public class GetEqualSubstringsWithinBudget {
    static void main() {
        /*
        You are given two strings s and t of the same length and an integer maxCost.
        You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).
        Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0

        Example 1:
        Input: s = "abcd", t = "bcdf", maxCost = 3
        Output: 3
        Explanation: "abc" of s can change to "bcd".
        That costs 3, so the maximum length is 3.
         */

        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;

        // System.out.println(equalSubstring(s, t, maxCost));
//        // System.out.println(abs('a','c'));

    }

    static int equalSubstring(String s, String t, int maxCost) {
        int[] cost = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cost[i] = abs(s.charAt(i), t.charAt(i)) ;
        }
        // System.out.println(Arrays.toString(cost));

        int MaxLen = maxLen(cost,maxCost);

        return MaxLen;
    }

    static int maxLen(int[] cost, int maxCost){

        int currentCost = 0;
        int left = 0;
        int maxLen = 0;

        // Sliding window with debug prints
        for (int right = 0; right < cost.length; right++) {
            currentCost += cost[right];
            // System.out.println("Added index " + right + " cost=" + cost[right] + " → total=" + currentCost);

            // If total cost > maxCost, shrink window
            while (currentCost > maxCost) {
                // System.out.println("  Exceeded maxCost! Removing index " + left + " cost=" + cost[left]);
                currentCost -= cost[left];
                left++;
                // System.out.println("  After removal total=" + currentCost);
            }

            int windowLen = right - left + 1;
            maxLen = Math.max(maxLen, windowLen);
            // System.out.println("Current window: [" + left + ", " + right + "] length=" + windowLen + " → maxLen=" + maxLen);
        }

        return maxLen;
    }

    static int abs(char a, char b) {
        return Math.abs((int)a - (int)b);
    }
}
