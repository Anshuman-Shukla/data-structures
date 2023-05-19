package com.dataStructure.practice.array;

public class Main {
    public static int[] oddpos(int [] arr, int size){
        int [] results = new int[size];
        for (int i = 1; i < size; i = i+2){
            results[i-1] =arr[i];
        }
        return results;
    }
    public static void main(String[] args) {
        int[] a ={53,44,33,32,31,65,34};
        int[] oddpos = oddpos(a, a.length);
        for(int v:oddpos) {
            System.out.println(v);
        }
    }
}
