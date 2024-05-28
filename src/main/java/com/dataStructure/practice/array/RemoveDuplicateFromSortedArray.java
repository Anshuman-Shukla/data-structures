package com.dataStructure.practice.array;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array - LeetCode 26
 * Given a sorted array nums, remove the duplicates in-place such that
 * each element appears only once and returns the new length. Do not allocate extra space for another array;
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example:
 * <p>
 * Input: nums = [1, 1, 2]
 * Output: 2
 */
public class RemoveDuplicateFromSortedArray {
    public static int returnNewLengthOfArrayWithoutDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return index+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2,3,3,4,4};
        System.out.println(returnNewLengthOfArrayWithoutDuplicate(arr));
    }
}
