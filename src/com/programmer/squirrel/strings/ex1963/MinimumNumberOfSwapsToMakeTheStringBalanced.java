package com.programmer.squirrel.strings.ex1963;

import java.util.Stack;

/**
 * Created for the leetCode project.
 * 1963. Minimum Number of Swaps to Make the String Balanced
 *
 * @author cesar pasillas
 */
public class MinimumNumberOfSwapsToMakeTheStringBalanced {

    public int minSwaps(String s) {

        System.out.println(s);

        Stack<Character> stack = new Stack();
        int noSwaps = 0;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '['){
                stack.push(ch);
            } else {
                if(!stack.isEmpty()){
                    stack.pop();
                } else {
                    noSwaps++;
                }
            }
        }

        return (noSwaps + 1) / 2;
    }


    public int minSwapsBest(String s) {
        int opening = 0;
        int unbalanced = 0;

        for (var c: s.getBytes()) {
            if (c == '[') {
                opening++;
            } else {
                if (opening > 0)
                    opening--;
                else
                    unbalanced++;
            }
        }

        return unbalanced / 2 + unbalanced % 2;
    }
}
