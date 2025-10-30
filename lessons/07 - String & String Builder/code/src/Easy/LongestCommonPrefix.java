package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    static void main() {
        /*
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
         */

        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));



    }

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Sort the array — the common prefix must be shared by the first and last strings
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // Compare characters until mismatch
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}
