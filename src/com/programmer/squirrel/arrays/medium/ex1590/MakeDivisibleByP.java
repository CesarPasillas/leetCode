package com.programmer.squirrel.arrays.medium.ex1590;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created for the leetCode project.
 *
 * @author Cesar Pasillas
 * @version 1.0
 */
public class MakeDivisibleByP {

    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        // Find remainder when total sum is divided by p
        long modTotalSum = Arrays.stream(nums)
                .mapToLong(i -> (long) i)
                .reduce(0L, (a, b) -> a + b) % p ;

        int remainder = (int) modTotalSum;

        // If remainder is 0, no subarray needs to be removed
        if (remainder == 0) {
            return 0;
        }

        HashMap<Integer, Integer> prefixModules = new HashMap<>();
        //prefixMod.put(0, -1);  // Initialize to handle full prefix
        int currentMode = 0;
        int minLength = n;

        for (int i = 0; i < n; ++i) {
            if (minLength == 1){
                return 1;
            }
            //prefixSum += nums[i];
            currentMode = (nums[i] + currentMode )% p; //calculate the module of the current element
            prefixModules.put(currentMode, i);

            int targetMod = (currentMode - remainder + p) % p; //Calculate the target current module, this means that
            if (remainder == currentMode){ //If those are equals verify the min length
                minLength = Math.min(i +1 , minLength);
            }
            if (prefixModules.get(targetMod) != null) {
                minLength = Math.min(minLength, i - prefixModules.get(targetMod));
            }


        }

        return minLength == n ? -1 : minLength;
    }

    public int minSubarrayBest(int[] nums, int p) {
        int n = nums.length;
        double sum = 0;
        for (int i : nums)
            sum += i;

        if (sum % p == 0.0)
            return 0;
        HashMap<Integer, Integer> mh = new HashMap<>();
        sum %= p;
        int s = (int)(sum);
        int len = n, mod = 0;
        for (int i = 0; i < n; i++) {
            if (len == 1)
                return 1;
            mod = (nums[i] + mod) % p; // Get the modulus of (the current element + current mod) % p
            mh.put(mod, i); // Store the modules of the current element in the map with it position
            if (s == mod) //If the restant of the total sum is equals to then we need to verify which value need to be deleted
                len = Math.min(i + 1, len); // current position + 1 or the actual lent.
            if (mh.get((mod + p - s) % p) != null) // the calculate the modulus of (current mod + p - remanent) if don't exist
                len = Math.min(len, i -  mh.get((mod + p - s) % p));
        }
        if(len==n)
            return -1;
        return len;
    }
}
