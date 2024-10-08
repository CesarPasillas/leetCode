package com.programmer.squirrel.arrays.medium.ex1813;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class SentenceSimilarityIIITestDrive {

    public static void main(String[] args) {
        SentenceSimilarityIII ss = new SentenceSimilarityIII();

        //validate(ss.areSentencesSimilarBest("My name is Haley", "My Haley"), true);

        //validate(ss.areSentencesSimilarBest("of", "A lot of words"), false);

        //validate(ss.areSentencesSimilarBest("Eating right now", "Eating"), true);
        validate(ss.areSentencesSimilaresOptimized("xD iP tqchblXgqvNVdi", "FmtdCzv Gp YZf UYJ xD iP tqchblXgqvNVdi"), true);
        //validate(ss.areSentencesSimilarBest("f", "a C"), false);

    }

    public static void validate (boolean ans, boolean exp){

        if (ans == exp){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
