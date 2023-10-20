package com.dataStructure.practice.revision;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindTheDuplicateFromArray {

    public static int[] duplicateInArray(int[] arr) {
        int[] ints = Arrays.stream(arr).distinct().toArray();
        return ints;

    }

    //a={1,1,2,2,3,4,3,3,2,5,5,6,6,7,7};
    public static void duplicate(int[] arr) {
        LinkedHashSet<Integer> ints = new LinkedHashSet<Integer>();
        for (int a : arr) {
            ints.add(a);
        }
        System.out.println(ints);
    }

    /*public static void removeDuplicate(int[] arr) {
        int length = arr.length;
        int[] finalarr = new int[length];
        int duplicate = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ( int[i] == int[j]){
                    duplicate++;
                }
            }

        }
    }*/

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 3, 3, 2, 5, 5, 6, 6, 7, 7};
        // Arrays.stream(duplicateInArray(a)).forEach(System.out::println);
        duplicate(a);
    }
}
