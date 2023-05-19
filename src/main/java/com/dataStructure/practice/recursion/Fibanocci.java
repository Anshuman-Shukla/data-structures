package com.dataStructure.practice.recursion;

import java.util.LinkedList;
import java.util.List;

public class Fibanocci {
    //f(n)=f(n-1)-f(n-2)
    //1,1,2,3,5,8,13,21,34
    public static int fibonacci(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));

    }
}
