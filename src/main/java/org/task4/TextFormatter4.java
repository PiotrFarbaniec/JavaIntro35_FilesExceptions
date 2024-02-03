package org.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFormatter4 {

    private String readTextFromFile(String pathName) {
        String readText = null;
        try {
            readText = Files.readString(Path.of(pathName));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return readText;
    }

    public boolean isContainMatchesWord(String pathName, String find) {
        String text = readTextFromFile(pathName);
        char[] charArray = (text.toLowerCase()).toCharArray();
        char[] toFind = (find.toLowerCase()).toCharArray();
        int n = charArray.length;
        int m = toFind.length;

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;

            for (int j = 0; j < m; j++) {
                if (charArray[i + j] != toFind[j]) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }
}