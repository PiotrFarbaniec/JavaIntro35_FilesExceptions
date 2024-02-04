package org.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataReader {
    private static String pathName = "data.txt";
    private static String text;


    static void getSignsNumberFromFile() {
        int signsNumber = 0;

        try {
            text = Files.readString(Path.of(pathName));
        } catch (
                IOException ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                signsNumber += 1;
            }
        }
        System.out.println("The number of all characters: " + text.length());
        System.out.println("The number of characters without white space: " + signsNumber);
    }
}
