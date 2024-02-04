package org.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFormatter5 {

    public String readTextFile(String pathName) {
        String readText = null;
        try {
            readText = Files.readString(Path.of(pathName));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return readText;
    }

    public String reverseText(String pathNam) {
        String text = readTextFile(pathNam);
        char[] textArray = text.toCharArray();
        char[] reversed = new char[textArray.length];

        for (int i = 0; i < textArray.length ; i++) {
            reversed[i] = textArray[textArray.length - 1 - i];
        }
        return new String(reversed);
    }
}