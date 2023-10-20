package com.dataStructure.practice.revision;

public class FindTheHighestValueFromArray {

    public static int findTheHighestValue(int[] arr) {
        int high = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high)
                high = arr[i];
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arrs= {2,5,4,32,2388,232,323,32,232,4,2,32,877};
        System.out.println(findTheHighestValue(arrs));
    }
}
