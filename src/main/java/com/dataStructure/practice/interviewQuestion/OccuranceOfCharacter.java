package com.dataStructure.practice.interviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Count occurance of character in the String.
 * Using: Java 8
 */
public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String str= "hellofhgaaaaaacccccccbbbbffgfghg";
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s,TreeMap::new, Collectors.counting()));
        System.out.println(collect);

    }
}
