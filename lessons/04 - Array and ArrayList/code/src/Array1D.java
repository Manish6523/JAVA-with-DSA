import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {

        // Array [ type 01 ]
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 5;
        arr1[2] = 4;
        System.out.println("Type 01 : " + Arrays.toString(arr1));

        // Array [ type 02 ]
        int[] arr2 = {2,4,8};
        System.out.println("Type 02 : " + Arrays.toString(arr2));

    }
}