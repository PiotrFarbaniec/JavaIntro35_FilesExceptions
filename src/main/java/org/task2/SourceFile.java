package org.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SourceFile {

    public List readLines(String pathName) throws IOException {
        List<String> linesList = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
        }
        return linesList;
    }
}
