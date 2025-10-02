package hard;

public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
    /*
        Example 1:
        Input: nums = [1,3,5]
        Output: 1

        Example 2:
        Input: nums = [2,2,2,0,1]
        Output: 0

     */
        System.out.println(findMin(new int[]{3,1,3}));
    }

    static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length-1;

            while (start<end){
                int mid = start + (end - start)/2;
                if (nums[mid] > nums[end]){
                    start = mid + 1;
                } else if (nums[mid] < nums[end]){
                    end = mid;
                } else {
                    end --;
                }
            }
        return nums[start];
        }
    }

