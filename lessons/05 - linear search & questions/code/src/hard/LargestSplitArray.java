package hard;

public class LargestSplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        while (start<end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2 ;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces ++;
                } else {
                    sum = sum + num;
                }
            }

            if (pieces > k){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // start == end
    }
}
