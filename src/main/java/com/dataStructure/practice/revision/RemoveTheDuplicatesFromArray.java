package com.dataStructure.practice.revision;

import java.util.Arrays;

public class RemoveTheDuplicatesFromArray {

    /**
     * arr={1,2,2,4,5,5,6,7,4}
     * required arr={1,2,4,5,6,7}
     */
    public static void removeDuplicate(int[] arr){
        int[] ints = Arrays.stream(arr).sorted().distinct().toArray();
        for (int a :ints)
            System.out.println(a);

    }

    public static void main(String[] args) {
        removeDuplicate(new int[]{1,2,2,4,5,5,6,7,4});
    }
}
