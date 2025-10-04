package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println("Selection sort : " + Arrays.toString(arr));
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] < arr[j]){
                    max = j;
                }
            }
            // swap
            int temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));

        }
    }
}
