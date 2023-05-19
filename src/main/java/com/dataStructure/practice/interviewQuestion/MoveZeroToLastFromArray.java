package com.dataStructure.practice.interviewQuestion;

/**
 * Move all zeros atlast.
 * input ::  int[] a = {1, 0, 2, 4, 0, 3};
 * output ::  int[] a = {1, 2, 4, 3, 0, 0};
 */
public class MoveZeroToLastFromArray {


    public static void zeroAtLatest(int[] array) {
        int count = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < length) {
            array[count++] = 0;
        }
        for (int a : array) {
            System.out.println(a);
        }

    }

    // Utility function to swap two elements of an array
    public static void moveZeroToLast(int[] A)
    {
        int n = A.length;
        int j = 0; //1
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {   //{1, 0, 2, 4, 0, 3};
                int temp = A[j]; //2
                A[j] = A[i];
                A[i] = temp;
                j++;

            }
            for (int a : A) {
                System.out.print(a +" ");

            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); // Print the array
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4,0, 2, 4, 0, 3};
       // zeroAtLatest(a);
        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        moveZeroToLast(a);

    }
}
