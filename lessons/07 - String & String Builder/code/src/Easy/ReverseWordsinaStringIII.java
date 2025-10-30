package Easy;

import java.util.Arrays;

public class ReverseWordsinaStringIII {
    static void main() {
        /*
        Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

        Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"

        Example 2:
        Input: s = "Mr Ding"
        Output: "rM gniD"
         */

        String a = "manish sharma";
        System.out.println(reverseWords(a));
    }

    static String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rev(arr[i]);
        }
        return String.join(" ", arr);
    }


    static String rev(String s) {
        char[] ch = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        while (start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++; end--;
        }
        return new String(ch);
    }
}
