package org.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseConverter {


    private String readTextFile(String pathName) throws FileNotFoundException {
        String readedText = "";

        if (pathName == null) {
            throw new IllegalArgumentException("File path name is null!");
        }
        File file = new File(pathName);

        if (!file.exists() || pathName.isBlank()) {
            throw new FileNotFoundException("Wrong file path name provided: " + pathName);
        }
        else {
            try {
                readedText = Files.readString(Path.of(pathName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return readedText;
    }


    public String reverseText(String pathName) {
        String invertedText = "";

        try {
            char[] textArray = readTextFile(pathName).toCharArray();
            char[] reversed = new char[textArray.length];

            for (int i = 0; i < textArray.length; i++) {
                reversed[i] = textArray[textArray.length - 1 - i];
            }
            invertedText = new String(reversed);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return invertedText;
    }
}