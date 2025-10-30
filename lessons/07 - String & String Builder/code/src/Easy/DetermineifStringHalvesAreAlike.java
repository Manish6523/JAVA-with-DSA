package Easy;

public class DetermineifStringHalvesAreAlike {
    static void main() {
        /*
        You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
        Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
        Return true if a and b are alike. Otherwise, return false.

        Example 1:
        Input: s = "book"
        Output: true
        Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
         */

        System.out.println(halvesAreAlike("book"));
    }
    static boolean halvesAreAlike(String s) {

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length()/2);

        if(volvs(s1) == volvs(s2)) return true;

        return false;
    }

    static int volvs (String str){
        int c = 0;
        char[] ch = str.toLowerCase().toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                c++;
            }
        }
        return c;
    }
}
