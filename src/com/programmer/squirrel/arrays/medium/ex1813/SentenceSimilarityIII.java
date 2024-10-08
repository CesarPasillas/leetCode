package com.programmer.squirrel.arrays.medium.ex1813;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class SentenceSimilarityIII {

    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        Deque<String> words1 = new ArrayDeque<>(Arrays.asList(sentence1.split(" ")));
        Deque<String> words2 = new ArrayDeque<>(Arrays.asList(sentence2.split(" ")));

        while (!words1.isEmpty() && !words2.isEmpty() && words1.peek().equals(words2.peek())) {
            words1.poll();
            words2.poll();
        }

        while (!words1.isEmpty() && !words2.isEmpty() && words1.peekLast().equals(words2.peekLast())) {
            words1.pollLast();
            words2.pollLast();
        }

        return words1.isEmpty() || words2.isEmpty();
    }

    public boolean areSentencesSimilarBest(String sent1, String sent2) {
        

        if(sent1.length()==sent2.length()){
            return sent1.equals(sent2);
        }
        if(sent2.length()<sent1.length()){
            String tmp = sent1;
            sent1 = sent2;
            sent2 = tmp;
        }
        int i = -1;
        while(i+1 < sent1.length() && sent1.charAt(i+1) == sent2.charAt(i+1)){
            i++;
        }
        int j = sent1.length();
        int last = sent2.length();
        while( j-1 >= 0 && sent1.charAt(j-1) == sent2.charAt(last-1)){
            j--;
            last--;
        }

        if(i == sent1.length()-1 && sent2.charAt(i+1) == ' '){
            return true;
        }
        if(j == 0 && sent2.charAt(last-1) == ' '){
            return true;
        }
        if(i+1 >= j && sent2.charAt(i) == ' ' && sent2.charAt(last) == ' '){
            return true;
        }

        return false;
    }

    public boolean areSentencesSimilaresOptimized(String sentence1, String sentence2){
        // Step 1: Split both sentences into arrays of words
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int i = 0;
        int j = 0;

        // Step 2: Match words from the start
        while (i < words1.length && i < words2.length && words1[i].equals(words2[i])) {
            i++;
        }

        // Step 3: Match words from the end
        while (j < words1.length - i && j < words2.length - i && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) {
            j++;
        }

        // Step 4: Check if all middle words have been matched
        return i + j == Math.min(words1.length, words2.length);
    }
}
