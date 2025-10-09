package Algorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        cyclic(arr);
        System.out.println("Cyclic sort : " + Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // value = idx - 1; [ if elem is 3 TF it should be at idx 2 ]
            int correctIdx = arr[i] - 1;

            if (arr[i] != arr[correctIdx]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
                System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));
            } else {
                i++;
            }
        }
    }
}
