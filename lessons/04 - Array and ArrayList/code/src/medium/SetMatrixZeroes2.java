package medium;
import java.util.Arrays;

public class SetMatrixZeroes2 {
    public static void main(String[] args) {
        // Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's

        // Example :
        // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        //Output: [[1,0,1],[0,0,0],[1,0,1]]

        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        System.out.println(Arrays.deepToString(setZero(arr)));
    }
    static int[][] setZero(int[][] arr){
        int[][] result = arr;

        // fetch every rows
        for (int i = 0; i < arr.length; i++) {
        int row = 0;
        boolean isSet = false;
            // fetch every element in that row
            for (int j = 0; j < arr[i].length; j++) {
                // if row has 0
                if(arr[i][j] == 0){
                    isSet = true;
                    row = i;
                }else {
                    isSet = false;
                }
                if (isSet) {
                    // make row's all elements to 0
                    for (int r = 0; r < arr[row].length; r++){
                        result[row][r] = 0;
                    }
                }
            }
        }

        // fetch every column
        for (int i = 0; i < arr.length; i++) {
            int col = 0;
            boolean isSet = false;
            // fetch every element in that row
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    col = j;
                    isSet = true;
                } else {
                    isSet = false;
                }
            }
            if (isSet){
                for (int k = 0; k < arr[col].length; k++) {
                    result[k][col] = 0;
                }
            }
        }

        return result;
    }
}
