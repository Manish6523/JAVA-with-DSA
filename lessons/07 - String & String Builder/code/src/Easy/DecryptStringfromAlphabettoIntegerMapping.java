package Easy;

public class DecryptStringfromAlphabettoIntegerMapping {
    static void main() {
        /*
        You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
            Characters ('a' to 'i') are represented by ('1' to '9') respectively.
            Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
        Return the string formed after mapping.
        The test cases are generated so that a unique mapping will always exist.

        Example 1:
        Input: s = "10#11#12"
        Output: "jkab"
        Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

        Example 2:
        Input: s = "1326#"
        Output: "acz"
         */

        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                System.out.println("ch => " + s.charAt(i));
                String ap = s.substring(i, i + 2);
                char ch = (char)(Integer.parseInt(ap)+'a'-1);
                sb.append(ch);
                i+=2;
            }else {
                System.out.println("ch => " + s.charAt(i));
                char ch = (char)(s.charAt(i)-'0'+'a'-1);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
