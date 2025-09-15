package medium;
import java.util.Arrays;

public class SetMatrixZeroes2 {
    public static void main(String[] args) {
        // Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's

        // Example :
        // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        //Output: [[1,0,1],[0,0,0],[1,0,1]]

        // Test Case 0 – Example from problem
        int[][] arr0 = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        System.out.println("Test 0: " + Arrays.deepToString(setZero(arr0)));

        // Test Case 1 – No zero at all
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Test 1: " + Arrays.deepToString(setZero(arr1)));

        // Test Case 2 – All elements are zero
        int[][] arr2 = {
                {0, 0},
                {0, 0}
        };
        System.out.println("Test 2: " + Arrays.deepToString(setZero(arr2)));

        // Test Case 3 – Zero in first row and column
        int[][] arr3 = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        System.out.println("Test 3: " + Arrays.deepToString(setZero(arr3)));

        // Test Case 4 – Multiple zeros in different rows/cols
        int[][] arr4 = {
                {5, 0, 7},
                {8, 9, 10},
                {0, 11, 12}
        };
        System.out.println("Test 4: " + Arrays.deepToString(setZero(arr4)));

        // Test Case 5 – Single row
        int[][] arr5 = {
                {1, 0, 3, 4}
        };
        System.out.println("Test 5: " + Arrays.deepToString(setZero(arr5)));

        // Test Case 6 – Single column
        int[][] arr6 = {
                {1},
                {0},
                {3}
        };
        System.out.println("Test 6: " + Arrays.deepToString(setZero(arr6)));

        // Test Case 7 – Rectangular 3x4
        int[][] arr7 = {
                {1, 2, 0, 4},
                {5, 6, 7, 8},
                {9, 0, 11, 12}
        };
        System.out.println("Test 7: " + Arrays.deepToString(setZero(arr7)));

        // Test Case 8 – Rectangular 4x2
        int[][] arr8 = {
                {1, 2},
                {0, 4},
                {5, 6},
                {7, 8}
        };
        System.out.println("Test 8: " + Arrays.deepToString(setZero(arr8)));


    }
    static int[][] setZero(int[][] arr){
        int[][] result = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];  // manual copy element by element
            }
        }

        int row;
        int col;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    row = i;
                    col = j;

//                    System.out.println("element : " + arr[i][j]);
//                    System.out.println("row : " + row);
//                    System.out.println("col : " + col);

                    for (int k = 0; k < arr[0].length; k++) {
                        result[row][k] = 0;
                    }
                    for (int k = 0; k < arr.length; k++) {
                        result[k][col] = 0;
                    }

                }
            }
        }

        return result;
    }
}
