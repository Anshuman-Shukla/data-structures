package com.dataStructure.practice.array;

import java.util.Arrays;

/**
 * Duplicate Number
 * Write a function which takes integer array as a
 * parameter and returns a new integer array with unique elements. (remove duplicates)
 * <p>
 * Example
 * <p>
 * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
 * Output : [1, 2, 3, 4, 5]
 */
public class RemoveDuplicate {
    public static int[] removeDuplicate(int[] arr) {
        int len = arr.length;
        int[] uniqueArr = new int[len];
        int index=0;
        for (int i = 0; i < len; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArr[index++]=arr[i];
            }
        }
        return Arrays.copyOf(uniqueArr,index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }

}
