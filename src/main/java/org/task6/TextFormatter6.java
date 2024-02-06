package org.task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TextFormatter6 {

    public String readTextFile (String sourceFile) throws NullPointerException, NoSuchFileException {
        File source = new File(sourceFile);
        String text = null;

        if (sourceFile == null) {
            throw new NullPointerException("File path name is null!");
        }
        else if (!source.exists() || sourceFile.isBlank()) {
            throw new NoSuchFileException("Wrong file path name / no name provided: " + sourceFile);
        }
        else {
            try {
                text = Files.readString(Path.of(sourceFile));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < textToWrite.length; i++) {
                writer.write(textToWrite[i]);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.err.println("Unexpected problem with writing to file: " + e.getCause());
            throw new RuntimeException(e.getCause());
        }
    }

    private File createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }
}