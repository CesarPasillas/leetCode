package com.programmer.squirrel.arrays;

import java.util.Arrays;

/**
 * Created for the leetCode project.
 *
 * @author Cesar Pasillas
 */
public class RotateImageTestDrive {

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        //int[][] matrix = new int[][] {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] matrix = new int[][] {{ 1, 2, 3, 4, 5}, { 6, 7, 8, 9,10},{11,12,13,14,15},{16,17,18,19,20}, {21,22,23,24,25}};

        Arrays.stream(matrix).forEach(a ->System.out.println(Arrays.toString(a)));

        rotateImage.rotate(matrix);

        Arrays.stream(matrix).forEach(a ->System.out.println(Arrays.toString(a)));

        /*[[1,2,3],[4,5,6],[7,8,9]]


         [[7,4,1],[8,5,2],[9,6,3]]*/
    }
}
