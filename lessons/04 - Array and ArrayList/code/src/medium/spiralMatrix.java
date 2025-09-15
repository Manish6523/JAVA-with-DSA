package medium;

import java.util.ArrayList;

public class spiralMatrix {
    public static void main(String[] args) {
        // Given an m x n matrix, return all elements of the matrix in spiral order.
        int[][] arr = {
                {1, 2, 3, 5, 6},
                {13, 14, 15, 16, 7},
                {12, 11, 10, 9, 8}
        };

        System.out.println("result spiral : " + spiral(arr));
    }

    static ArrayList<Integer> spiral(int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1) traverse top row (left → right)
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;

            // 2) traverse right column (top → bottom)
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // 3) traverse bottom row (right → left)
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }

            // 4) traverse left column (bottom → top)
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
