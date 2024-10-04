package com.programmer.squirrel.top.math;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class RomanToIntegerTestDrive {

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();

        validate(rti.romanToInt("III"), 3);
        validate(rti.romanToInt("XIV"), 14);
        validate(rti.romanToInt("MMMCMXCIX"), 3999);
        validate(rti.romanToInt("MCDXLIV"), 1444);
        validate(rti.romanToInt("LII"), 52);
    }

    public static void validate (int ans, int exp){

        if (ans == exp){
            System.out.println("True: " +  ans);
        } else {
            System.out.println("False: " +  ans);
        }
    }
}
