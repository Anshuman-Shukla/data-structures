package com.dataStructure.practice.array;

/**
 * 2D Arrays
 * Given 2D array calculate the sum of diagonal elements.
 *
 * Example
 *
 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 *
 * sumDiagonalElements(myArray2D) # 15
 */
public class SumOfDiagonalElementIn2D {
    public static void main(String[] args) {
      int[][]  myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        int sum = sumOfDiagonalElementWithSingleLoop(myArray2D);
        System.out.println(sum);
    }
    //Double loop not preferred
    public static int sumOfDiagonalElement(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    //Single loop
    public static int sumOfDiagonalElementWithSingleLoop(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }
}
