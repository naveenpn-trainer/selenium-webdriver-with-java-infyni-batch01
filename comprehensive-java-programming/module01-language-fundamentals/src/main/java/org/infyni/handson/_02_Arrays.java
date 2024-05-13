package org.infyni.handson;

public class _02_Arrays {
    public static void main(String[] args) {
        // Array Declaration + Array Instantiation
        String[] programmingLanguages = new String[5];
        //  Array Initialization
        programmingLanguages[0] = "C";
        programmingLanguages[1] = "C++";
        programmingLanguages[2] = "Java";
        programmingLanguages[3] = "Scala";

        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}
