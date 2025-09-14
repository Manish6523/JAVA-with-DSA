import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}