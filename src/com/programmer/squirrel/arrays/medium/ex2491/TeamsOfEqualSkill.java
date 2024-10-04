package com.programmer.squirrel.arrays.medium.ex2491;

import java.util.Arrays;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class TeamsOfEqualSkill {

    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);

        int l = 0;
        int r = skill.length -1;
        int skillTeam = skill[l] + skill[r];
        long sum = (long) skill[l] * skill[r];
        l++;
        r--;

        while (l < r){

            if (skillTeam == (skill[l] + skill[r])){
                sum += (long) skill[l] * skill[r];
            } else {
                return -1;
            }
            l++;
            r--;
        }

        return sum;
    }
}
