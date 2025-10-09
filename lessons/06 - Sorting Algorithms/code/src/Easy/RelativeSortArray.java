package Easy;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        /*
        Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
        Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

        Example 1:
        Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        Output: [2,2,2,1,4,3,3,9,6,7,19]

        Example 2:
        Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
        Output: [22,28,8,6,17,44]
         */
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        int[] r = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(r));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = arr1[0];

        for (int n : arr1){
            if (n>max) max = n;
        }

        int[] result = new int[arr1.length];

        int[] frequency = new int[max+1];

        for (int k : arr1) {
            frequency[k] += 1;
        }

        int idx = 0;
        for (int k : arr2) {
            for (int j = 0; j < frequency[k]; j++) {
                result[idx++] = k;
            }
            frequency[k] = 0;
        }
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                result[idx++] = i;
                frequency[i]--;
            }
        }
        return result;
    }
}
