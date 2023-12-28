package com.dataStructure.practice.parenthesisMatching;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(' , ')' , '{' , '}' , '[' & ']' ,
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 *
 * Open brackets must be closed in the correct order.
 *
 * Every close bracket has a corresponding open bracket of the same type.
 */
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

        System.out.println(checkParenthesisMatching("{}{[({})]}{}"));
        }
    }
