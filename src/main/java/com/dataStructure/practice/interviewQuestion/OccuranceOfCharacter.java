package com.dataStructure.practice.interviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * Count occurance of character in the String.
 * Using: Java 8
 */
public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String str= "hellofhgffgfghg";
        LinkedHashMap<String, Long> result = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);

    }
}
