package easy;

public class CellingOfaNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,17,18};
        int target = 5;
        int ans = celling(arr,target);
        System.out.println("celling of " + target + " is " +arr[ans]);
    }

    static int celling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start)/2;

            if(arr[middle] < target){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
    return start;
    }
}
