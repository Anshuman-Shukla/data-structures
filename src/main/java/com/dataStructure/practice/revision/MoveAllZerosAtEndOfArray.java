package com.dataStructure.practice.revision;

public class MoveAllZerosAtEndOfArray {


    // arr={1,0,5,0,6,0,7,0};
    //required arr={1,5,6,7,0,0,0,0};
    public static int[] moveZeroAtEnd(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] finalarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                finalarr[right] = 0;
                right--;
            }else{
                finalarr[left]=arr[i];
                left++;
            }
        }
        return finalarr;
    }
    // arr={1,0,5,0,6,0,7,0};
    //required arr={1,5,6,7,0,0,0,0};
    public static int[] moveZeroWithoutUsingSecondVariable(int[] arr){
        int index=0;//taking this index as non Zero Index//1
        int length=arr.length;
        for (int i = 0;i<length;i++){
            if(arr[i]!=0){
                int temp = arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,0,5,0,6,0,7,0,5,4,43,0,23,0,23,0,20,320};
        int[] moved = moveZeroWithoutUsingSecondVariable(arr);
        for (int a: moved){
            System.out.print(a+"  ::  ");
        }

    }
}
