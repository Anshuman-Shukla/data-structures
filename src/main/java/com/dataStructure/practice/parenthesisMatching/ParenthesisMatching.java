package com.dataStructure.practice.parenthesisMatching;

import java.util.Stack;

public class ParenthesisMatching {
    public static boolean checkParenthesisMatching(String match) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < match.length(); i++) {
            char character = match.charAt(i);
            if (checkOpenParenthesis(character)) {
                characterStack.push(character);
            } else {
                if (characterStack.empty())
                    return false;
                else if (!isMatching(characterStack.peek(), character))
                    return false;
                 else
                    characterStack.pop();
                }
            }
            return characterStack.empty();
        }

        public static boolean checkOpenParenthesis(Character character){
            return character == '(' || character == '{' || character == '[';
        }

        public static boolean isMatching (Character fromStack, Character fromInput){
            return (fromStack == '(' && fromInput == ')') ||
                    (fromStack == '{' && fromInput == '}') ||
                    (fromStack == '[' && fromInput == ']');
        }

        public static void main (String[]args){
            System.out.println(checkParenthesisMatching("{[({})]}"));
        }
    }
