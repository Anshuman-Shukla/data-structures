package com.dataStructure.practice.revision;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenEqualCharacters {

    public static int largestSubstringBetweenEqualCharacters(String s) {
        Map<Character, Integer> charIndices = new HashMap<>();
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charIndices.containsKey(currentChar)) {
                // Calculate the length of the substring between the two occurrences of the character
                int length = i - charIndices.get(currentChar) - 1;
                maxLength = Math.max(maxLength, length);
            }

            // Update the index of the current character
            charIndices.put(currentChar, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str="abadfdsdafd";
        System.out.println(largestSubstringBetweenEqualCharacters(str));
    }
}
