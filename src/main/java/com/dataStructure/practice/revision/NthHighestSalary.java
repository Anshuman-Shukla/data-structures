package com.dataStructure.practice.revision;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void findNthHighestSalary(Map<String, Integer> salary, int nth) {
        Map.Entry<Integer, List<String>> collect = salary.entrySet().stream()
                .collect(Collectors
                        .groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))
                )
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(nth - 1);
        System.out.println(collect);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anshu", 1200);
        map.put("Shukla", 1200);
        map.put("Rahul", 1300);
        map.put("Mike", 1400);
        map.put("Ted", 1400);
        map.put("Jim", 1300);
        map.put("Jack", 1200);
        map.put("Vimal", 1000);
        map.put("Anup", 1200);
        findNthHighestSalary(map, 4);

        String s= "Anshuman";
        String s1=s;
        String s3 = new String("Anshuman");
        System.out.println(s==s1);
        System.out.println("  equals "+s.equals(s1));
        System.out.println(s==s3 );
        System.out.println("  equals "+s.equals(s3));
        System.out.println(s1==s3);
        System.out.println("  equals "+s1.equals(s3));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

    }
}
