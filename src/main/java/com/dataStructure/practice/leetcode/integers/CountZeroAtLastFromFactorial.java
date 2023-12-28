package com.dataStructure.practice.leetcode.integers;

public class CountZeroAtLastFromFactorial {
    /**
     * num/5 +num/5^2 +num/5^3 +num/5^4 ........
     *
     * @param num
     * @return
     */
    public static Integer zerosAtLastInFactorial(Integer num){
        int count = 0;
        int currentPower =5;
        while (num>=currentPower){
            count +=(num/currentPower);
            currentPower= currentPower*5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number Of zeros at last:: "+zerosAtLastInFactorial(25));
    }
}
