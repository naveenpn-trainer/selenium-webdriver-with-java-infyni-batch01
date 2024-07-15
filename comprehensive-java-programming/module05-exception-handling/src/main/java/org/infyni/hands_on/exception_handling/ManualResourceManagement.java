package org.infyni.hands_on.exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ManualResourceManagement {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            File file = new File("example.txt");
            System.out.println(file.getCanonicalPath());
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Executed");
                } catch (IOException e) {
                    System.err.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
