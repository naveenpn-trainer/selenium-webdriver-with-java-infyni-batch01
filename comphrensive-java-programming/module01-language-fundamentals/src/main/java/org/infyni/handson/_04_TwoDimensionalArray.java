package org.infyni.handson;

import java.util.Arrays;

public class _04_TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }

        System.out.println("Java 8");
        Arrays.stream(matrix).forEach(row-> {
            Arrays.stream(row).forEach(col -> System.out.print(col+"\t"));
            System.out.println();
        });
    }
}
