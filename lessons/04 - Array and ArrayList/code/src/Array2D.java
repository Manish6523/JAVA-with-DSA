import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 2D arrays : type 01
        int[][] arr = new int[2][2]; // 2x2 matrix
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        show(arr);

        // 2D arrays : type 02
        int[][] Arr = {  // 2x2 matrix
                {10,20},
                {30,40}
        };
        show(Arr);

        // taking input in an 2D array
        int[][] arrays = new int[3][2];
        System.out.print("Enter input for 2D array : ");

        // taking inputs in a 2D array
        for (int row = 0; row<arrays.length; row++){
            for (int col = 0; col<arrays[row].length; col++){
                arrays[row][col] = in.nextInt();
            }
        }
        show(arrays);
    }
    static void show(int[][] array){
        // normal FOR Loop
//        for (int i = 0; i<array.length; i++){
//            System.out.println(Arrays.toString(array[i]));
//        }

        //enhanced FOR Loop
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
    }
}
