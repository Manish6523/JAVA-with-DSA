package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingtheSentence {
    static void main() {
        /*
        A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
        A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
            For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
        Given a shuffled sentence splited containing no more than 9 words, reconstruct and return the original sentence.

        Example 1:
        Input: splited = "is2 sentence4 This1 a3"
        Output: "This is a sentence"
        Explanation: Sort the words in splited to their original positions "This1 is2 a3 sentence4", then remove the numbers.
         */

        String sen = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sen));


    }



    static String sortSentence(String s) {
        String[] splited = s.split(" ");
        String[] ans = new String[splited.length];

        for (int i = 0; i < splited.length; i++) {
            String c = splited[i].substring(0, splited[i].length() - 1);
            int idx = splited[i].charAt(splited[i].length() - 1) - '0' -1;
            ans[idx] = c;
        }

        return String.join(" ",ans);
    }

}
