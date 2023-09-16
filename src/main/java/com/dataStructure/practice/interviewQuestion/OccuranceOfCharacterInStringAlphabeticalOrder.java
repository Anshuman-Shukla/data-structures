package com.dataStructure.practice.interviewQuestion;


import java.util.Arrays;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfCharacterInStringAlphabeticalOrder {
    public static void main(String[] args) {

        String str = "anshumanshuklaasdasbnabiuhd";
        LinkedHashMap<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(result);
    }
}
