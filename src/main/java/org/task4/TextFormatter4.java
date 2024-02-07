package org.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TextFormatter4 {


    public String readTextFile(String pathName) throws FileNotFoundException {
        String readedText = null;

        if (pathName == null) {
            throw new IllegalArgumentException("File path name is null!");
        }
        File sourceFile = new File(pathName);

        if (!sourceFile.exists() || pathName.isBlank()) {
            throw new FileNotFoundException("Wrong file path name provided: " + pathName);
        }
        try {
            readedText = Files.readString(Path.of(pathName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return readedText;
    }


    public boolean isTextContainWord(String pathName, String searchWord) {
        try {
            if (searchWord !=null && readTextFile(pathName) != null) {
                if (readTextFile(pathName).toLowerCase().contains(searchWord.toLowerCase())) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}