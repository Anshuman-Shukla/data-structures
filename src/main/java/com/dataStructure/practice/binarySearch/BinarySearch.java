package com.dataStructure.practice.binarySearch;

import java.util.Arrays;

/**
 * Steps: To search using binary search
 * 1.Find the mid index: mid=(low+high)/2
 * 2.If a[mid] == key(value to be found) then return mid
 * 3.If key>a[mid] Repeat but now low = mid -1
 * 4.If key<a[mid] Repeat but now high= mid -1
 */
public class BinarySearch {

    public static int searchBinary(int[] sortedArray, int key) {
        System.out.println("Enter into Sorted Array Method");
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] == key) {;
                return mid;
            } else if (key > sortedArray[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] sorted=new int[]{1,2,3,12,13,25};
       int i = searchBinary(sorted, 12);
       System.out.println(i);

    }
}
