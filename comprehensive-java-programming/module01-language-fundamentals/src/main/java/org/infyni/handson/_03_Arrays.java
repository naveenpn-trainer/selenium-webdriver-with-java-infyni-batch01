package org.infyni.handson;

public class _03_Arrays {
    public static void main(String[] args) {
        // Array Declaration + Instantiation + Initialization
        String[] programmingLanguages = {"C", "C++", "Java"};
        System.out.println(programmingLanguages.length);
        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}
