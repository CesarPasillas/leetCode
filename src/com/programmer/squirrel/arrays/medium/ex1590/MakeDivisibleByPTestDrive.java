package com.programmer.squirrel.arrays.medium.ex1590;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class MakeDivisibleByPTestDrive {

    public static void main(String[] args) {
        MakeDivisibleByP mdbp = new MakeDivisibleByP();

        /*int[] arr = {3, 1, 4, 2};
        int p = 6;*/

        //int[] arr = {1000, 200, 331, 1, 2, 3, 4, 5, 11};
        //int p = 15;

        int[] arr = {6,3,5,2};
        int p = 9;

        mdbp.minSubarray(arr, p);


    }

}
