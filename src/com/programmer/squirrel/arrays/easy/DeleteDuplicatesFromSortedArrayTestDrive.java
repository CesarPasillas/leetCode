package com.programmer.squirrel.arrays.easy;

import java.util.Arrays;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class DeleteDuplicatesFromSortedArrayTestDrive {

    public static void main(String[] args) {
        DeleteDuplicatesFromSortedArray dd = new DeleteDuplicatesFromSortedArray();

        int[] arr = {1,1,2};

        validate(dd.removeDuplicates(arr), 2, arr);

    }

    private static void validate(int ans, int expected , int[] arr){

        System.out.println((ans == expected) + " - k = " + ans);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 2)));

    }
}
