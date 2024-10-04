package com.programmer.squirrel.arrays.easy;

/**
 * Created for the leetCode project.
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
 * element appears only once. The relative order of the elements should be kept the same. Then return the number of
 * unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were
 * present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 *
 * Return k.
 *
 * @author cesarpasillas
 * @version 1.0
 */
public class DeleteDuplicatesFromSortedArray {

    /**This is my solution uses Sliding window
     * Time O(n) - where n is the nums.length - 1, because r starts in 1;
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        int l = 0;
        int r = l+1;

        while(r < nums.length){

            if (nums[l] == nums[r]){
                r++;
            } else {
                l++;
                nums[l] = nums[r];

            }
        }
        return l + 1;

    }
}
