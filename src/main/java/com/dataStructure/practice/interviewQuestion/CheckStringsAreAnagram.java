package com.dataStructure.practice.interviewQuestion;

import java.util.Arrays;

public class CheckStringsAreAnagram {
    public static boolean checkAnagram(String s1,String s2){
        if(s1==null || s2==null || s1.length()!=s2.length()){
            return false;
        }
        char[] charsOfs1 = s1.toCharArray();
        char[] charsOfs2 = s2.toCharArray();
        Arrays.sort(charsOfs1);
        Arrays.sort(charsOfs2);
        return Arrays.equals(charsOfs1,charsOfs2);

    }
    public static void main(String[] args) {
        String a1 = "Fired";
        String s2 = "Fried";
        if (checkAnagram(a1, s2)) {
            System.out.println("Both Strings are Anagram!!");
        } else {
            System.out.println("Strings are not Anagram!!");
        }
    }
}
