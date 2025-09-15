package medium;
import java.util.Arrays;

public class spiralMatrix2 {
    public static void main(String[] args) {
        // Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

        int matrix = 3;

        System.out.println("------------------------------------------------------------");
        System.out.println("Spiral Matrix : " + Arrays.deepToString(spiral(matrix)));
        System.out.println("------------------------------------------------------------");

    }

    static int[][] spiral(int matrix) {
//        ArrayList<Integer> result = new ArrayList<>();
        int[][] spiralMatrix = new int[matrix][matrix];

        int top = 0;
        int bottom = spiralMatrix.length - 1;
        int left = 0;
        int right = spiralMatrix[0].length - 1;

        int currentValue = 1;

        while(top<=bottom && left<=right){

            // add values on top -> left to right
            for (int i = left; i <= right; i++) {
                spiralMatrix[top][i] = currentValue;
                currentValue++;
            }
            top++;

            // add values on right-> top to bottom
            for (int i = top; i <= bottom; i++) {
                spiralMatrix[i][right] = currentValue;
                currentValue++;
            }
            right--;

            // add values on bottom-> right to left
            for (int i = right; i >= left; i--) {
                spiralMatrix[bottom][i] = currentValue;
                currentValue++;
            }
            bottom--;

            // add values on left-> bottom to top
            for (int i = bottom; i >= top; i--) {
                spiralMatrix[i][left] = currentValue;
                currentValue++;
            }
            left++;
        }
        return spiralMatrix;
    }
}
