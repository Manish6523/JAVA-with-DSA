package easy;

public class MaximumSubarray {
    public static void main(String[] args) {
        /*
        Given an integer array nums, find the with the largest sum, and return its sum.

        Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        * */


        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
        int total = 0;
            for (int j = i ; j < arr.length; j++) {
//                System.out.println("Total of "+ total+" " + " " +arr[j] + " = " + (total + arr[j]));
                total = total + arr[j];
                if(total > max) {
                    max = total;
//                    System.out.println(max);
                }
            }
        }
        System.out.println("Maximum subarray sum : " + max);
    }
}
