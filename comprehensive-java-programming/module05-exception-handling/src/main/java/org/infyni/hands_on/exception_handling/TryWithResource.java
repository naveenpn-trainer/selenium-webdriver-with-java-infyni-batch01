package org.infyni.hands_on.exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
        } catch (IOException ex) {
            System.out.println("The file is not found");
        }
    }
}
