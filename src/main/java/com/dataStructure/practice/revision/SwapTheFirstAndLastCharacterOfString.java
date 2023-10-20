package com.dataStructure.practice.revision;

import java.util.Objects;

public class SwapTheFirstAndLastCharacterOfString {


    public static String swapFirstAndLastChar(String str) {
        if (!Objects.nonNull(str) || str.length() < 2)
            return "Character can't be swap";

        char first = str.charAt(0);
        char second = str.charAt(str.length() - 1);
        char[] characters = str.toCharArray();
        characters[0] = second;
        characters[characters.length - 1] = first;
        return String.valueOf(characters);
    }
    public static void main(String[] args) {
        System.out.println(swapFirstAndLastChar("Rahul"));
    }
}
