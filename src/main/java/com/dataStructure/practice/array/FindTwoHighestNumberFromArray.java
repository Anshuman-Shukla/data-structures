package com.dataStructure.practice.array;

public class FindTwoHighestNumberFromArray {
    public static int[] arr={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
public static int[] findFirstSecondHighestFromArray(int [] arr){
    int lenth=arr.length;
    int first=0;
    int second=0;
    for(int i=0;i<lenth;i++){
        for (int j=i+1;j<lenth;j++){
            if(arr[i]>arr[j]){
                if(arr[i] > first){
                    second=first;
                    first=arr[i];
                }
            }
        }
    }
    System.out.println(first+ "   "+ second);
    return new int[]{first,second};
}
    public static void main(String[] args) {


    findFirstSecondHighestFromArray(arr);
    }
}
