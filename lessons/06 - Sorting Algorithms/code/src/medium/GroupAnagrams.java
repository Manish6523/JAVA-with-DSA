package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        /*
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Explanation:
            There is no string in strs that can be rearranged to form "bat".
            The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
            The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

        Example 2:
        Input: strs = [""]
        Output: [[""]]
         */
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }

    static List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(arr[i]);
            visited[i] = true;

            for (int j = i+1; j < arr.length; j++) {
                if (!visited[j] && isAnagram(new String[]{arr[i], arr[j]})) {
                    group.add(arr[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);

        }
        return ans;
    }

    static boolean isAnagram(String[] strs){
        char[] str1 = strs[0].toCharArray();
        char[] str2 = strs[1].toCharArray();
        if (str1.length != str2.length) return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2);
    }

}
