package easy;

public class CellingANDFloor {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,17,18};
        int target = 1;
        int ans = floor(arr,target);
        int ans2 = celling(arr,target);

        if (ans != -1) System.out.println("flooring of " + target + " is " +arr[ans]);
        if (ans2 != -1) System.out.println("celling  of " + target + " is " +arr[ans2]);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[0]){
            return -1;
        }

        while(start <= end){
            int middle = start + (end - start)/2;

            if(arr[middle] < target){
                start = middle + 1;
            } else if (arr[middle] == target) {
                return middle;
            } else {
                end = middle - 1;
            }
        }
        return end;
    }

    static int celling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]){
            return -1;
        }

        while(start <= end){
            int middle = start + (end - start)/2;

            if(arr[middle] < target){
                start = middle + 1;
            } else if (arr[middle] == target) {
                return middle;
            } else {
                end = middle - 1;
            }
        }
    return start;
    }
}
