package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintWordsVertically {
    static void main() {
        /*
        Given a string s. Return all the words vertically in the same order in which they appear in s.
        Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
        Each word would be put on only one column and that in one column there will be only one word.

        Example 1:
        Input: s = "HOW ARE YOU"
        Output: ["HAY","ORO","WEU"]

        Explanation: Each word is printed vertically.
         "HAY"
         "ORO"
         "WEU"

        Example 2:
        Input: s = "TO BE OR NOT TO BE"
        Output: ["TBONTB","OEROOE","   T"]

        Explanation: Trailing spaces is not allowed.
        "TBONTB"
        "OEROOE"
        "   T"
         */

        String s = "TO BE OR NOT TO BE";
        // [TBONTB, OEROOE,    T]
        System.out.println(printVertically(s));
    }

    static List<String> printVertically(String s) {
        List<String> ls = new ArrayList<String>();

        String[] str = s.split(" ");

        int max = 0;
        for(String k : str){
            if (k.length()>max) {
                max = k.length();
            }
        }

        char[][] ch = new char[max][str.length];

        // add chars in matrix ( ch ) vertically.
        for (int row = 0; row < ch.length; row++) {
            for (int cols = 0; cols < ch[row].length; cols++) {
                if (row > str[cols].length()-1) {
                    ch[row][cols] = ' ';
                }else {
                    ch[row][cols] = str[cols].charAt(row);
                }
            }
        }
        System.out.println("------------------------------");

        //  conver ch elements to string
        for (char[] chars : ch) {
            System.out.println(Arrays.toString(chars));
            String rowStr = new String(chars);
            // remove trailing spaces but keep leading spaces
            rowStr = removeTrailingSpaces(rowStr);
            ls.add(rowStr);
        }
        System.out.println("------------------------------");



        return ls;
    }
    static String removeTrailingSpaces(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        return s.substring(0, end + 1);
    }
}
