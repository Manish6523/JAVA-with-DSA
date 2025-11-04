package medium;

public class RepeatedStringMatch {
    static void main() {
        /*
        Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
        Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

        Example 1:
        Input: a = "abcd", b = "cdabcdab"
        Output: 3
        Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
         */
        String a = "abcd";
        String b = "cdabcdab";

        System.out.println(repeatedStringMatch(a,b));

    }

    static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (sb.length() < b.length()){
            sb.append(a);
            count++;
        }
        if (sb.toString().contains(b)){
            return count;
        }
        sb.append(a);
        count++;
        if (sb.toString().contains(b)){
            return count;
        }
        return -1;
    }

    // another one
    public int another(String a, String b) {
        int count = (b.length() + a.length() - 1) / a.length();

        StringBuilder sb = new StringBuilder(a.repeat(count));

        if (sb.indexOf(b) != -1) return count;

        sb.append(a);
        if (sb.indexOf(b) != -1) return count + 1;

        return -1;
    }
}
