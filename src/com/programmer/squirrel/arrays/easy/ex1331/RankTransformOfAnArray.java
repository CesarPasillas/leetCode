package com.programmer.squirrel.arrays.easy.ex1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created for the leetCode project.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class RankTransformOfAnArray {

    /**
     * This is my solution
     * Time O(n log n)
     * @param arr
     * @return
     */
    public int[] arrayRankTransform1(int[] arr) {

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        Map<Integer, Integer> ranks = new HashMap<>();
        int x = 0;

        for(int num : copy ){
            if (!ranks.containsKey(num)){
                ranks.put(num, x+1 );
                x++;
            }
        }

        ranks.forEach((n,m) -> System.out.println(n + " " +m));

        int[] result = new int[arr.length];


        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            result[i] = ranks.get(arr[i]);
        }

        return result;
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] res = new int [arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val: arr) {
            max = Math.max(val, max);
            min = Math.min(val, min);
        }

        if (max - min > 200 && arr.length < 10) {
            int [] tmp = arr.clone();
            Arrays.sort(arr);
            int index = 1;
            boolean isRepeat = false;
            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];
                isRepeat = false;
                for (int j = 0; j < tmp.length; j++) {
                    if (tmp[j] == val) {
                        if (isRepeat) {
                            i++;
                        }
                        res[j] = index;
                        isRepeat = true;
                    }
                }
                index++;
            }
            return res;

        } else {
            // [40,10,20,30]  nums[0 - 30]
            // [100]
            int[] nums = new int [max - min + 1];
            for (int i = 0; i < arr.length; i++) {
                nums[arr[i] - min] = 1;
            }

            int rank = 1;
            for (int i = 0; i < max - min + 1; i++) {
                if (nums[i] == 1) {
                    nums[i] = rank;
                    rank++;
                }
            }

            //System.out.println(Arrays.toString(nums));
            for (int i = 0; i < arr.length; i++) {
                res[i] = nums[arr[i]-min];
            }

            return res;
        }
    }
}
