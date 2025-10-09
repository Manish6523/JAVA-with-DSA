package Easy;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        /*
        You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
        You are given an integer array nums representing the data status of this set after the error.
        Find the number that occurs twice and the number that is missing and return them in the form of an array.

        Example 1:
        Input: nums = [1,2,2,4]
        Output: [2,3]

        Example 2:
        Input: nums = [1,1]
        Output: [1,2]
         */

        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
    }

    static int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){

                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    ans[0] = arr[i];
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                ans[1] = j+1;
            }
        }
        return ans;
    }
}
