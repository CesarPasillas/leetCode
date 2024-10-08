package com.programmer.squirrel.strings.ex2696;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class MinimumLengthAfterRemovingSubstrings {

    public int minLength(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){

            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }

            if (c == 'B' && stack.peek() == 'A'){
                stack.pop();
            } else if (c == 'D' && stack.peek() == 'C'){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

    public int minLengthBest(String s) {
        int n = s.length();
        int p = -1;
        char[] stack = new char[n];

        for (char c : s.toCharArray()) {
            if (p >= 0 && ((c == 'B' && stack[p] == 'A') || (c == 'D' && stack[p] == 'C'))) {
                p--;
            } else {
                stack[++p] = c;
            }
        }
        return p + 1;
    }
}
