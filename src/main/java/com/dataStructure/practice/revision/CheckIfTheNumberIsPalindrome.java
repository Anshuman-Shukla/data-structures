package com.dataStructure.practice.revision;

public class CheckIfTheNumberIsPalindrome {

    public static Boolean checkPalindrome(int num) {
        int temp = num, rev = 0;
        while (temp > 0) {
            //get the last digit
            int a = temp % 10;
            //reverse the number
            rev = (rev * 10) + a;
            //remove the last number
            temp = temp / 10;
        }
        if (rev != num)
            return false;
        return true;
    }

    public static Boolean checkStringPalindrome(String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(1221));
        System.out.println(checkStringPalindrome("naman"));;
    }
}
