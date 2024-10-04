package com.programmer.squirrel.top.math;

import java.util.HashMap;
import java.util.Map;

/**
 * Created for the leetCode project.
 *
 * @author Cesar Pasillas
 */
public class RomanToInteger {

    Map<String, Integer> letters;

    public RomanToInteger(){
        letters = new HashMap<>();
        letters.put("I", 1);
        letters.put("II", 2);
        letters.put("III", 3);
        letters.put("IV", 4);
        letters.put("V", 5);
        letters.put("IX", 9);
        letters.put("X", 10);
        letters.put("XX", 10);
        letters.put("XXX", 10);
        letters.put("XL", 40);
        letters.put("L", 50);
        letters.put("XC", 90);
        letters.put("C", 100);
        letters.put("CC", 100);
        letters.put("CCC", 100);
        letters.put("CD", 400);
        letters.put("D", 500);
        letters.put("CM", 900);
        letters.put("M", 1000);
        letters.put("MM", 1000);
        letters.put("MMM", 1000);
    }

    public int romanToInt(String s) {

        System.out.println(s);

        int len = s.length() - 1;
        int num = 0;

        while (len > -1){
            String snum = null;
            char c = s.charAt(len);

            if( (c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M') && len > 0){

                snum = s.substring(len - 1, len + 1) ;

                if (letters.get(snum) == null){
                    snum = String.valueOf(c);
                    len--;
                } else {
                    len-=2;
                }
            } else {

                snum = String.valueOf(c);
                len--;
            }

            num += letters.get(snum);

        }

        return num;
    }

    public int romanToIntBetter(String s) {
        int converted = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    converted++;
                    break;
                case 'V':
                    if(i > 0 && chars[i - 1] == 'I') {
                        converted += 3;
                    }
                    else {
                        converted += 5;
                    }
                    break;
                case 'X':
                    if(i > 0 && chars[i - 1] == 'I') {
                        converted += 8;
                    }
                    else{
                        converted += 10;
                    }
                    break;
                case 'L':
                    if(i > 0 && chars[i - 1] == 'X') {
                        converted += 30;
                    }
                    else{
                        converted += 50;
                    }
                    break;
                case 'C':
                    if(i > 0 && chars[i - 1] == 'X') {
                        converted += 80;
                    }
                    else{
                        converted += 100;
                    }
                    break;
                case 'D':
                    if(i > 0 && chars[i - 1] == 'C') {
                        converted += 300;
                    }
                    else{
                        converted += 500;
                    }
                    break;
                case 'M':
                    if(i > 0 && chars[i - 1] == 'C') {
                        converted += 800;
                    }
                    else{
                        converted += 1000;
                    }
                    break;
                default: ;
            }
        }
        return converted;
    }
}
