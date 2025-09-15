package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        /* *
        The array-form of an integer num is an array representing its digits in left to right order.
        For example, for num = 1321, the array form is [1,3,2,1].
        Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

        Example 1:
        Input: num = [1,2,0,0], k = 34
        Output: [1,2,3,4]
        Explanation: 1200 + 34 = 1234
        * */

        Scanner in = new Scanner(System.in);
        int k = 34;
        int[] arr = new int[4];

        System.out.print("Enter elements in array [ 4 ] : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Input : " + Arrays.toString(arr));

        int digit = convertArrayToInteger(arr) + k;
        ArrayList<Integer> ar = converIntegerToArray(digit);
        System.out.println("Output : " + ar.toString());
    }



    static int convertArrayToInteger(int[] array){
        int digit = 0;
        for(int n:array){
            digit = digit*10 +n;
        }
        return digit;
    }

    static ArrayList<Integer> converIntegerToArray(int digit){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(digit>0){
            int rem = digit % 10;
            arrayList.addFirst(rem);
            digit = digit/10;
        }
        return arrayList;
    }
}
