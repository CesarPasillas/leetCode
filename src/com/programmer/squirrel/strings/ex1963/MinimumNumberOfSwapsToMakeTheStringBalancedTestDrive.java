package com.programmer.squirrel.strings.ex1963;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 */
public class MinimumNumberOfSwapsToMakeTheStringBalancedTestDrive {

    public static void main(String[] args) {
        MinimumNumberOfSwapsToMakeTheStringBalanced mnostmtsb = new MinimumNumberOfSwapsToMakeTheStringBalanced();

        validate(mnostmtsb.minSwapsBest("][[]][][[][]"), 1);
    }

    private static void validate(int ans, int exp){
        if (ans == exp){
            System.out.println("True: " + ans);
        } else {
            System.out.println("False: " + ans);
        }
    }
}
