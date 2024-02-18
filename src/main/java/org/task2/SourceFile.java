package org.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

public class SourceFile {

    public List readLines(String pathName) throws NullPointerException, IOException {
        File file  = new File(pathName);
        List<String> linesList = new ArrayList<>();
        String line;

        if (pathName == null ) {
            throw new NullPointerException("File path name can't be null!");
        }
        else if (!file.exists() || pathName.isBlank()) {
            throw new NoSuchFileException("There is no such file exists/no file name provided: " + pathName);
        }
        else if (pathName != null && !pathName.isBlank() && file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
                while ((line = reader.readLine()) != null) {
                    linesList.add(line);
                }
            }
        }
        return linesList;
    }
}
