package org.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TextFormatter5 {

    private char[] reversed;
    private char[] textArray;

    private String readTextFile(String pathName) throws NullPointerException, NoSuchFileException {
        String readedText = "";
        File file = new File(pathName);
        if (file == null) {
            throw new NullPointerException("File path name is null!");
        } else if (!file.exists() || pathName.isBlank()) {
            throw new NoSuchFileException("Wrong file path name or no name has been provided: " + pathName);
        }
        else {
            try {
                readedText = Files.readString(Path.of(pathName));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return readedText;
    }


    public String reverseText(String pathName) {
        String invertedText = "";
        try {
            textArray = readTextFile(pathName).toCharArray();
            reversed = new char[textArray.length];

            for (int i = 0; i < textArray.length; i++) {
                reversed[i] = textArray[textArray.length - 1 - i];
            }
          invertedText = new String(reversed);
        } catch (NullPointerException e1) {
            System.err.println(e1.getMessage());
        } catch (NoSuchFileException e2) {
            System.err.println(e2.getMessage());
        }
        return invertedText;
    }
}