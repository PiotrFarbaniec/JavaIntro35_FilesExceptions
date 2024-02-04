package org.task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFormatter6 {
    public String readTextFile (String sourceFile) {
        String text = null;
        try {
            text = Files.readString(Path.of(sourceFile));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    public void writeToFile (String outputFile, String... textToWrite) {
        File file = new File(outputFile);
        if(!file.exists()) {
            createFile(outputFile);
        }
        if(!file.canWrite()) {
            file.setWritable(true);
        }
        try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < textToWrite.length; i++) {
                writer2.write(textToWrite[i]);
                writer2.newLine();
                writer2.flush();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new RuntimeException(e2);
        }
    }

    private File createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return file;
    }
}