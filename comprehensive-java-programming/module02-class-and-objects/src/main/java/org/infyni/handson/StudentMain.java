package org.infyni.handson;

import java.util.Arrays;

class Student {
    int rollNo;
    String name;
    int[] marks;

    public void printDetails() {
        System.out.println("Name= " + name + "\nRoll No: " + rollNo + "\nMarks: " + Arrays.toString(marks) + "\nTotal Marks: " + getTotalMarks() + "\nPercentage " + calculatePercentage());
    }

    public int getTotalMarks() {
        return Arrays.stream(marks).sum();
    }

    public double calculatePercentage() {
        int marksObtained = getTotalMarks();
        double percentage = ((double) marksObtained / 400) * 100;
        return percentage;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.name = "Balaram";
        studentOne.rollNo = 1;
        int[] marks = {60, 70, 80, 90};
        studentOne.marks = marks;
        studentOne.printDetails();

        System.out.println("***************");
        Student studentTwo = new Student();
        studentTwo.name = "Krishna";
        studentTwo.rollNo = 2;
        int[] marks1 = {70, 70, 80, 90};
        studentTwo.marks = marks1;
        studentTwo.printDetails();
    }
}
