package com.programmer.squirrel.strings.ex567;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created for the leetCode project.
 *
 * @author cesar pasillas
 */
public class PermutationString {

    //Time: O((m - n) (n log n))
    public boolean checkInclusion(String s1, String s2) {


        s1 = sort(s1); //(n log n)
        int s1Len = s1.length();

        for (int i = 0; i <= s2.length() - s1Len; i++){
            if(s1.equals(sort(s2.substring(i, i + s1Len)))){ // (sm log sm)
                return true;
            }
        }

        return false;

    }

    private String sort(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);

    }

    public boolean checkInclusionHash(String s1, String s2){
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap<Character, Integer> s2map = new HashMap<>();
            for (int j = 0; j < s1.length(); j++) {
                s2map.put(s2.charAt(i + j), s2map.getOrDefault(s2.charAt(i + j), 0) + 1);
            }
            if (matches(s1map, s2map))
                return true;
        }

        return true;
    }

    private boolean matches(HashMap<Character, Integer> s1map, HashMap<Character, Integer> s2map) {
        for (char key : s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }

    public boolean checkInclusionArray(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1arr = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1arr[s1.charAt(i) - 'a']++;
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2arr = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2arr[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1arr, s2arr))
                return true;
        }
        return false;
    }

    public boolean matches(int[] s1arr, int[] s2arr) {
        for (int i = 0; i < 26; i++) {
            if (s1arr[i] != s2arr[i])
                return false;
        }
        return true;
    }

    public boolean checkInclusionWindow(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matchesWindow(s1arr, s2arr))
                return true;
            s2arr[s2.charAt(i + s1.length()) - 'a']++;
            s2arr[s2.charAt(i) - 'a']--;
        }
        return matchesWindow(s1arr, s2arr);
    }

    public boolean matchesWindow(int[] s1arr, int[] s2arr) {
        for (int i = 0; i < 26; i++) {
            if (s1arr[i] != s2arr[i])
                return false;
        }
        return true;
    }

}
