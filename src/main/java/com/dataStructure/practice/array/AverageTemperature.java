package com.dataStructure.practice.array;

public class AverageTemperature {

    private static int[] temp={1,3,4,5,6,7,3,26};

    public static void main(String[] args) {
        int sum=0;
        int count= temp.length;
        for(int i=0;i<count;i++){
            sum+=temp[i];
        }
        System.out.println("Sum :"+sum+"Average of the array:: "+(sum/count));
    }
}
