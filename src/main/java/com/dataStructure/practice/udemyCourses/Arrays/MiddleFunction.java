package com.dataStructure.practice.udemyCourses.Arrays;

import java.util.Arrays;

/**
 * Write a function called middle that takes an array and returns a new array that contains all
 * but the first and last elements.
 * myArray = [1, 2, 3, 4]
 * middle(myArray)  # [2,3].
 */
public class MiddleFunction {

    public static int[] middleFunction(int[] arr) {
        int[] finalArr = new int[arr.length - 2];
        int j = 0;
        for (int i = 1; i < arr.length-1; i++) {
            finalArr[j] = arr[i];
            j++;
        }
        return finalArr;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middleFunction(test)));
    }
}
