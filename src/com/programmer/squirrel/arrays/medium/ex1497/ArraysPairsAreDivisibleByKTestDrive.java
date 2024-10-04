package com.programmer.squirrel.arrays.medium.ex1497;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class ArraysPairsAreDivisibleByKTestDrive {

    public static void main(String[] args) {
        ArraysPairsAreDivisibleByK algorithm = new ArraysPairsAreDivisibleByK();

        int[]  arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;

        validate(algorithm.canArrange(arr, k), true);

        arr = new int[]{1,2,3,4,5,6};
        k = 7;

        validate(algorithm.canArrange(arr, k), true);

        arr = new int[]{1,2,3,4,5,6};
        k = 10;

        validate(algorithm.canArrange(arr, k), false);

        arr= new int[]{-1,1,-2,2,-3,3,-4,4};
        k = 3;

        validate(algorithm.canArrange(arr, k), true);

        validate(algorithm.canArrangeImp(arr, k), true);
    }

    private static void validate(boolean answer, boolean expected){
        if (answer) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
