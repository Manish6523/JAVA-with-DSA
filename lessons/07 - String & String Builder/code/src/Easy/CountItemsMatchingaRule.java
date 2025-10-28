package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {
    static void main() {
        /*
        You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
        The ith item is said to match the rule if one of the following is true:
            ruleKey == "type" and ruleValue == typei.
            ruleKey == "color" and ruleValue == colori.
            ruleKey == "name" and ruleValue == namei.
        Return the number of items that match the given rule.

        Example 1:
        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
         */
        // --- Test Case 1 ---
        List<List<String>> items1 = new ArrayList<>();
        items1.add(Arrays.asList("phone", "blue", "pixel"));
        items1.add(Arrays.asList("computer", "silver", "lenovo"));
        items1.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey1 = "color";
        String ruleValue1 = "silver";

        System.out.println("Test 1 Output: " + countMatches(items1, ruleKey1, ruleValue1));
        // Expected Output: 1


        // --- Test Case 2 ---
        List<List<String>> items2 = new ArrayList<>();
        items2.add(Arrays.asList("phone", "blue", "pixel"));
        items2.add(Arrays.asList("computer", "silver", "phone"));
        items2.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey2 = "type";
        String ruleValue2 = "phone";

        System.out.println("Test 2 Output: " + countMatches(items2, ruleKey2, ruleValue2));
        // Expected Output: 2

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int keyIdx = 0;
        if (ruleKey.equals("color")) {
            keyIdx = 1;
        } else if (ruleKey.equals("name")){
            keyIdx = 2;
        }
        int ans = 0;

        for (List<String> item : items) {
            if (item.get(keyIdx).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}
