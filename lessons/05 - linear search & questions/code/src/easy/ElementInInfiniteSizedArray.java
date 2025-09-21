package easy;

public class ElementInInfiniteSizedArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 18, 24, 32, 47, 50, 52, 68, 71, 72, 84, 85, 89, 91, 93, 95, 97, 102, 110, 118, 124, 131, 139, 145, 149, 152, 158, 161, 167, 172, 178, 182, 186, 193, 197, 200, 205, 210, 219, 223, 227, 231, 239, 243, 250, 258, 262, 269, 274, 281, 289, 293, 298, 303, 310, 315, 322, 329, 334, 340, 345, 352, 360, 368, 374, 380, 388, 392, 401, 409, 417, 423, 429, 435, 442, 450, 456, 462, 469, 474, 482, 489, 495, 501, 507, 513, 520, 527, 533, 540, 546, 553, 560, 566, 572, 579, 586, 593, 600};
        int target = 110;

        int ans = range(arr,target);

        System.out.println("element " + target + " is at index : " + ans);


    }

    static int range(int[] arr, int target){
        int startIdx = 0;
        int endIdx = 1;


        while (arr[endIdx] < target){
            int temp = endIdx + 1;
            endIdx = (endIdx + (endIdx - startIdx + 1) )* 2;
            startIdx = temp;
        }

        return search(arr, target,startIdx,endIdx);

    }

    static int search(int[] arr, int target, int startIdx, int endIdx) {
        int start = startIdx;
        int end = endIdx;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
