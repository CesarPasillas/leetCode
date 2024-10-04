package com.programmer.squirrel.top;

import java.util.Arrays;

/**
 * Created for the leetCode project.
 *
 * @author Cesar Pasillas
 */
public class RotateImageTestDrive {

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix1 = new int[][] {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] matrix2 = new int[][] {{ 1, 2, 3, 4, 5}, { 6, 7, 8, 9,10},{11,12,13,14,15},{16,17,18,19,20}, {21,22,23,24,25}};

        Arrays.stream(matrix1).forEach(a ->System.out.println(Arrays.toString(a)));

        rotateImage.rotateBest(matrix1);

        Arrays.stream(matrix1).forEach(a ->System.out.println(Arrays.toString(a)));

        System.out.println();

        Arrays.stream(matrix2).forEach(a ->System.out.println(Arrays.toString(a)));

        rotateImage.rotateBest(matrix2);

        Arrays.stream(matrix2).forEach(a ->System.out.println(Arrays.toString(a)));
    }
}
