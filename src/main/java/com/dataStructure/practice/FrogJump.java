package com.dataStructure.practice;

import java.io.*;

import java.util.*;

public class FrogJump {

    static int findMaxDistance(int[] blocks) {

        int N = blocks.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];

        int i = 1;

        while (i < blocks.length) {
            // previous is greater than current
            if (blocks[i] >= blocks[i - 1]) {
                leftMax[i] = leftMax[i - 1] + 1;
            } else {
                leftMax[i] = 0;
            }

            i++;

        }

        rightMax[N - 1] = 0;  //
        int j = N - 2;
        while (j >= 0) {
            // next is greater than current
            if (blocks[j] >= blocks[j + 1]) {
                rightMax[j] = rightMax[j + 1] + 1;
            } else {
                rightMax[j] = 0;
            }

            j--;

        }

        int maxD = 0;

        for (int k = 0; k < N; k++) {
            maxD = Math.max(maxD, leftMax[k] + rightMax[k] + 1);

        }

        return maxD;

    }

    public static void main(String[] args) {
        int[] arr={2,6,8,5};

        System.out.println(findMaxDistance(arr));
    }

}