package com.dataStructure.practice.udemyCourses.Arrays;

import java.util.Arrays;

public class Rotate2DBy90Degree {
    public static void rotateMatrix(int[][] matrix) {
        System.out.println("Before Rotation"+Arrays.deepToString(matrix));
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            System.out.println("layer "+layer);
            int last = n - 1 - layer;
            System.out.println(matrix[first][last]);
            for (int i = first; i < last; i++) {
                System.out.println("inner loop "+i);
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        System.out.println("After Rotation"+Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,13},{4,5,6,14},{7,8,9,15},{10,11,12,16}};
        rotateMatrix(matrix);
    }
}
