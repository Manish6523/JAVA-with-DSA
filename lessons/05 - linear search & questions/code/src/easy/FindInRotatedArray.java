package easy;

public class FindInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target);

        System.out.println(ans);

    }
    static int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1; // target is in left half
                    } else {
                        left = mid + 1; // target is in right half
                    }
                }
                // Right half is sorted
                else {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1; // target is in right half
                    } else {
                        right = mid - 1; // target is in left half
                    }
                }
            }

            return -1; // not found
        }
}
