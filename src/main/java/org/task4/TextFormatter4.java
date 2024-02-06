package org.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TextFormatter4 {

    public String readTextFromFile(String pathName) throws NullPointerException, NoSuchFileException {
        String readedText = null;
        File sourceFile = new File(pathName);

        if (pathName == null) {
            throw new NullPointerException("File path name can't be null!");
        }
        else if (!sourceFile.exists() || pathName.isBlank()) {
            throw new NoSuchFileException("Wrong file path name or no name has been provided");
        }
        try {
            readedText = Files.readString(Path.of(pathName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return readedText;
    }


    public boolean isContainMatchesWord(String pathName, String find) {
        try {
            char[] charArray = (readTextFromFile(pathName).toLowerCase()).toCharArray();
            char[] toFind = (find.toLowerCase()).toCharArray();
            int n = charArray.length;
            int m = toFind.length;

            for (int i = 0; i <= n - m; i++) {
                boolean isFound = true;

                for (int j = 0; j < m; j++) {
                    if (charArray[i + j] != toFind[j]) {
                        isFound = false;
                    }
                }
                if (isFound) return true;
            }
        } catch (NullPointerException e1) {
            System.err.println(e1.getMessage());
        } catch (NoSuchFileException e2) {
            System.err.println(e2.getMessage());
        }
        return false;
    }
}