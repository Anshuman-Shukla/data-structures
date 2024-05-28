package com.dataStructure.practice.array;

import java.util.Arrays;

/**
 * Write a function called middle that takes an array and returns a
 * new array that contains all but the first and last elements.
 * myArray = [1, 2, 3, 4]
 * middle(myArray)  # [2,3].
 */
public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] middleFunction = middleFunction(arr);
        System.out.println(Arrays.toString(middleFunction));
    }
    public static int[] middleFunction(int[] arr){
        int arrlength =arr.length;
        int[] a=new int[arrlength-2];
        int aIndex=1;
        while(aIndex<arrlength-1){
            a[aIndex-1]=arr[aIndex];
            aIndex++;
        }
        return a;
    }
}
