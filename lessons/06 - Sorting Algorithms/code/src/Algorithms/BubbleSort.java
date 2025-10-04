package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,0};
        bubble(arr);
        System.out.println("Bubble sort : " + Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));
            if (!isSwapped){
                break;
            }
        }
    }
}
