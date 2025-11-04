package medium;

public class ShiftingLetters {
    static void main() {
        /*
        You are given a string s of lowercase English letters and an integer array shifts of the same length.
        Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
            For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
        Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
        Return the final string after all such shifts to s are applied.

        Example 1:
        Input: s = "abc", shifts = [3,5,9]
        Output: "rpl"
        Explanation: We start with "abc".
        After shifting the first 1 letters of s by 3, we have "dbc".
        After shifting the first 2 letters of s by 5, we have "igc".
        After shifting the first 3 letters of s by 9, we have "rpl", the answer.
         */

        String s = "bad";
        int[] shifts = {10, 20, 30};
        System.out.println(shiftingLetters(s, shifts));
    }

    static String shiftingLetters(String s, int[] shifts) {
        StringBuilder result = new StringBuilder(s);
        int n = shifts.length;
        long totalShift = 0; // use long to avoid overflow

        // compute cumulative shifts from the end using long
        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            char c = s.charAt(i);
            char shifted = (char) ((c - 'a' + totalShift) % 26 + 'a');
            result.setCharAt(i, shifted);
        }

        return result.toString();
    }
}
