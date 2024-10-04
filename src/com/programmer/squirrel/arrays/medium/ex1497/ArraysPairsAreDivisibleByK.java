package com.programmer.squirrel.arrays.medium.ex1497;

/**
 * Created for the leetCode project.
 *
 * 1497. Check If Array Pairs Are Divisible by k
 * Medium
 * Given an array of integers arr of even length n and an integer k.
 *
 * We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
 *
 * Return true If you can find a way to do that or false otherwise.
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
 * Output: true
 * Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
 * Example 2:
 *
 * Input: arr = [1,2,3,4,5,6], k = 7
 * Output: true
 * Explanation: Pairs are (1,6),(2,5) and(3,4).
 * Example 3:
 *
 * Input: arr = [1,2,3,4,5,6], k = 10
 * Output: false
 * Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.
 *
 *
 * Constraints:
 *
 * arr.length == n
 * 1 <= n <= 105
 * n is even.
 * -109 <= arr[i] <= 109
 * 1 <= k <= 105
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class ArraysPairsAreDivisibleByK {

    /**
     * The conclusion is reached to use modular remainders because they allow us to break down the divisibility problem
     * into a series of simple comparisons between remainders. This simplifies the verification of the necessary
     * conditions to form pairs and allows us to solve the problem efficiently using modular arithmetic and remainder
     * counting.
     * Time O(n) - Where n is the larger number between k or arr.length.
     * Space O(k) - where k is an array of of possible remainders of k.
     * @param arr
     * @param k
     * @return
     */
    public boolean canArrange(int[] arr, int k) {
        //create a frecuency array to count occurences of remainders
        int[] remainders = new int[k];

        //Count the frecuency of the remainders
        for (int num : arr){
            int remainder = num % k;
            if (remainder < 0 ){
                remainder += k;
            }
            remainders[remainder] += 1;
        }

        for (int i = 0; i < k; i++){
            if (i == 0){
                if (remainders[i] % 2 != 0){
                    return false;
                }
            } else if (i == k - i){
                if (remainders[i] % 2 != 0){
                    return false;
                }
            } else {
                if (remainders[i] != remainders[k - i]){
                    return false;
                }

            }
        }

        return true;
    }

    /**
     * This solution improves the canArrange() solution
     * Time O(arr)
     * @param arr
     * @param k
     * @return
     */
    public boolean canArrangeImp(int[] arr, int k) {
        int[] freq = new int[k];

        for (int num : arr) {
            freq[((num % k) + k) % k]++;
        }

        if (freq[0] % 2 != 0) return false;

        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) return false;
        }

        return true;
    }
}
