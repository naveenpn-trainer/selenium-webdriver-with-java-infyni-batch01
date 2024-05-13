package org.infyni.handson;

import java.util.Arrays;

/*
    Array Creation can be explained in three steps
    1. Array Declaration
    2. Array Instantiation
    3 Array Initialization
 */
public class _01_Arrays {
    public static void main(String[] args) {
        // Array Declaration
        int [] marks;
        // Array Instantiation
        marks = new int[5];
        // Array Initialization
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;

        System.out.println("Iterating Array using Normal For Loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Iterating Array using Enhanced For Loop");
        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("Iterating Array using Java-8 Streams");
        Arrays.stream(marks).forEach(e -> System.out.println(e));

    }
}
