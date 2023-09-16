package com.dataStructure.practice.revision;

public class CheckIfArrayIsPalindrome {

    public static boolean checkArray(int[] arr) {
        int mid = arr.length / 2;
        int len = arr.length;
        boolean flag = true;
        for (int i = 0; i < mid; i++) {
            if (arr[i] != arr[len - 1])
                flag = false;
            len--;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 2, 1,4};
        System.out.println(checkArray(arrs));
    }
}
