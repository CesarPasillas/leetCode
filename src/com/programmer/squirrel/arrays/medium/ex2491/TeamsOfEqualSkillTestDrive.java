package com.programmer.squirrel.arrays.medium.ex2491;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class TeamsOfEqualSkillTestDrive {

    public static void main(String[] args) {

        TeamsOfEqualSkill toes = new TeamsOfEqualSkill();
        int[] arr = {3,2,5,1,3,4};

        validate(toes.dividePlayers(arr), 22L);

        arr = new int[]{3, 4};

        validate(toes.dividePlayers(arr), 12L);

        arr = new int[]{1,1,2,3};

        validate(toes.dividePlayers(arr), -1L);

        arr = new int[]{2,2,2,2};

        validate(toes.dividePlayers(arr), 8);
    }

    public static void validate(long ans, long exp){
        if(ans == exp){
            System.out.println("true : " + ans);
        } else {
            System.out.println("false : " + ans);
        }
    }
}
