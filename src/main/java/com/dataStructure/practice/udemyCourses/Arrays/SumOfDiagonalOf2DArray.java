package com.dataStructure.practice.udemyCourses.Arrays;

/**
 * 2D Arrays
 * Given 2D array calculate the sum of diagonal elements.
 * Example
 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 *
 * sumDiagonalElements(myArray2D) # 15
 */
public class SumOfDiagonalOf2DArray {

    public static int sumOfDiagonal(int[][] arr){
        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
      int[][]  myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfDiagonal(myArray2D));
    }
}
