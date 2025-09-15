import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,6,-8,34,5,-2,55,-9};
        String str = "Manish";
        int target = 34;
        char target2 = 'M';

        int[] range = {4,6};

        int ans = linearSearch(arr, target);
        int ans2 = stringSearch(str, target2);
        int ans3 = searchInRange(arr, target, range);
        int[] ans4 = minMax(arr);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Linear Search [ Target " + target + " is at ] : " + ans + " Index");
        System.out.println("String Search [ Target " + target2 + " is at ] : " + ans2 + " Index");
        System.out.println("Range Search [ Target " + target + " is at ] : " + ans3 + " Index");
        System.out.println("Min & Max in : " + Arrays.toString(ans4));
        System.out.println("----------------------------------------------------------------------");


    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int stringSearch(String str, char target){
        if (str.isEmpty()) return -1;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == target){
                return i;
            }
        }
        return 3;
    }
    static int searchInRange(int[] arr, int target, int[] range){
        if (arr.length == 0) return -1;
        for (int i = range[0]; i <= range[1]; i++) {
            if (arr[i] == target){
                return i;
            }
        }
       return -1;
    }
    static int[] minMax(int[] arr){
        int[] ans = new int[2];
        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (j < min) min = j;
            if (j > max) max = j;
        }

        ans[0] = min;
        ans[1] = max;

        return ans;
    }

}