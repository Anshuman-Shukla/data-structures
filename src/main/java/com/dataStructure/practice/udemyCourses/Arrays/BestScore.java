package com.dataStructure.practice.udemyCourses.Arrays;

import java.util.Arrays;

/**
 * Best Score
 * Given an array, write a function to get first, second best scores from the array and return it in new array.
 * Array may contain duplicates.
 * Example
 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 * firstSecond(myArray) // {90, 87}
 */
public class BestScore {
    public static int[] bestScore(int[] arr){
        int[] output=new int[2];
        int first=0;
        int second=0;
        int length = arr.length;
        for(int i = 0; i< length; i++){
            for(int j = i+1; j< length; j++){
                if(arr[i]>arr[j]){
                    if(arr[i]>first){
                        second=first;
                        first=arr[i];
                    }
                }
            }
        }
        output[0]=first;
        output[1]=second;
        return output;

    }
    public static int[] singleLoopToFindTheBestScore(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int score:arr){
            if(score>first){
                second=first;
                first=score;
            } else if (score>second && score<first) {
                second=score;

            }
        }
        return new int[]{first,second};
    }
    public static void main(String[] args) {
       int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(singleLoopToFindTheBestScore(myArray)));
    }
}
