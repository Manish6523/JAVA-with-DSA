package Easy;

import java.util.Arrays;

public class ValidPalindrome {
    static void main() {
        /*
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
         */

        String  s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

    }

    static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] ch = cleaned.toCharArray();
//        

        int start = 0;
        int end = ch.length - 1;
        while (start<end){
            if (ch[start] == ch[end]){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
