public class BinarySearch {
    static void main() {
        int target = 8;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    static int BS(int[] arr, int target,int start,int end) {
        int mid = start + (end - start) / 2;

        if (arr[mid]==target) return mid;
        if(start>end) return -1;
        if(arr[mid]>target){
            end = mid-1;
            return BS(arr, target,start,end);
        } else {
            start=mid+1;
            return BS(arr, target,start,end);
        }
    }
}