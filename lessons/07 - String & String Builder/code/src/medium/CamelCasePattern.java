package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCasePattern {
    static void main() {
        /*
        Given an array of strings queries and a string pattern, return a boolean array answer where answer[i] is true if queries[i] matches pattern, and false otherwise.
        A query word queries[i] matches pattern if you can insert lowercase English letters into the pattern so that it equals the query. You may insert a character at any position in pattern or you may choose not to insert any characters at all.

        Example 1:

        Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
        Output: [true,false,true,true,false]
        Explanation: "FooBar" can be generated like this "F" + "oo" + "B" + "ar".
        "FootBall" can be generated like this "F" + "oot" + "B" + "all".
        "FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".
         */
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FBl";

//        System.out.println(Arrays.toString("FaceBookGame".split("(?=[A-Z])")));
//        System.out.println(Arrays.toString("FoBa".split("(?=[A-Z])")));

        System.out.println(camelMatch(queries,pattern));

//        System.out.println(isMatch("FooBarTest", new Lis{"Fo","Ba","T"}));

    }

    static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (String str:queries){
            result.add(isMatch(str,pattern));
        }

        return result;
    }

    static boolean isMatch(String query, String pattern) {
        int i = 0; // Pointer for pattern
        System.out.println("\nChecking query: " + query);
        for (char c : query.toCharArray()) {
            if (i < pattern.length() && c == pattern.charAt(i)) {
                System.out.println("Matched '" + c + "' with pattern[" + i + "]");
                i++;
            } else if (Character.isUpperCase(c)) {
                System.out.println("Invalid uppercase '" + c + "' not matching pattern.");
                return false;
            } else {
                System.out.println("Skipped lowercase '" + c + "'");
            }
        }
        boolean res = i == pattern.length();
        System.out.println("Final: matched pattern completely? " + res);
        return res;
    }
}
