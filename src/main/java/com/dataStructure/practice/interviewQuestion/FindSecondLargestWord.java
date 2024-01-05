package com.dataStructure.practice.interviewQuestion;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestWord {
    public static void main(String[] args) {
        String str="I am a good programmer";
        String secondLargestword = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargestword);
    }
}
