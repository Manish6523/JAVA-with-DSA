package medium;

public class CountNumberofHomogenousSubstrings {
    static void main() {
        /*
        Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.
        A string is homogenous if all the characters of the string are the same.
        A substring is a contiguous sequence of characters within a string.

        Example 1:
        Input: s = "abbcccaa"
        Output: 13
        Explanation: The homogenous substrings are listed as below:
        "a"   appears 3 times.
        "aa"  appears 1 time.
        "b"   appears 2 times.
        "bb"  appears 1 time.
        "c"   appears 3 times.
        "cc"  appears 2 times.
        "ccc" appears 1 time.
        3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
         */
        String s = "aaaaab";

        System.out.println(" --> "+countHomogenous(s));
    }

    static int countHomogenous(String s) {
        int MOD = 1_000_000_007;
        long count = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            // Expand while same character
            if (s.charAt(end) == s.charAt(start)) {
                end++;
            } else {
                int len = end - start;
                count = (count + (long) len * (len + 1) / 2) % MOD;
                // move start to this new different char
                start = end;
            }
        }

        // last block
        int len = end - start;
        count = (count + (long) len * (len + 1) / 2) % MOD;

        return (int) count;
    }
}
