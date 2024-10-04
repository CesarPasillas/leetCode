package com.programmer.squirrel.top;

/**
 * Created for the LeetCode Algorithms project.
 *
 * Rotate Image
 * Solution
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }

    }

    private static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }


    public void rotateBest(int[][] matrix) {

        int len = matrix.length - 1;

        for(int i = 0; i < (matrix.length + 1) /2; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int tmp = matrix[i][j];
                //topL = botL
                matrix[i][j] = matrix[len - j][i];
                //botL = botR
                matrix[matrix.length - 1 -j][i] = matrix[len - i][len - j];
                //botR = topR
                matrix[matrix.length - 1 - i][len - j] = matrix[j][len - i];
                //topR = tmp
                matrix[j][len - i] = tmp;
            }
        }

    }

}
