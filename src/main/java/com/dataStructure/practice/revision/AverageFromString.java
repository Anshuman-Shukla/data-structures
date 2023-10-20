package com.dataStructure.practice.revision;

import java.util.Arrays;

public class AverageFromString {

    public static void averageOfString(String str){
        double asDouble = Arrays.stream(str.split(""))
                .mapToInt(Integer::valueOf)
                .average().getAsDouble();
        System.out.println(asDouble);

    }
    public static void average(String str){
        char[] chars = str.toCharArray();
        double sum=0;
        for(int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i])){
               sum= sum+Character.getNumericValue(chars[i]);
            }
        }

        System.out.println(sum/ chars.length);
    }

    public static void main(String[] args) {
        average("123252");
    }
}
