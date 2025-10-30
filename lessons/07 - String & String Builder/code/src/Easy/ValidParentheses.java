package Easy;

import java.util.Stack;

public class ValidParentheses {
    static void main() {
        /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.
            Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true
         */
        String s = "({";
        System.out.println(isValid(s));

    }
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if (s.length() == 1) return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("Stack : " + st + " --> " + ch );
            boolean isOpen = isOpen(ch);
            if (isOpen) {
                st.push(ch);
            } else {
                if (st.isEmpty() || st.pop() != opp(ch)) return false;
            }
        }

        return st.isEmpty();
    }

    static boolean isOpen(char ch) {
        char[] op = {'[', '(', '{'};
        for (char c : op){
            if (c == ch) return true;
        }
        return false;
    }

    static char opp(char ch) {
        switch (ch) {
            case '}': return '{';
            case ']': return '[';
            case ')': return '(';
            default: return 0; // just in case
        }
    }

}
