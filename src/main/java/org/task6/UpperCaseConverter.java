package org.task6;

import java.io.*;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UpperCaseConverter {

    private String readTextFile (String inputPath) throws FileNotFoundException {
        String text = "";

        File source = new File(inputPath);
        if (!source.exists()) {
            throw new FileNotFoundException("Input File: " + inputPath + " does not exist!");
        }
        else {
            try {
                text = Files.readString(Path.of(inputPath));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        return text;
    }


    public void capitalizeFileContent(String inputPath, String outputPath)
            throws FileSystemException, FileNotFoundException {

        if (inputPath == null || outputPath == null ||
                inputPath.isBlank() || outputPath.isBlank()) {
            throw new IllegalArgumentException("Wrong input/output path name provided (null/blank)!");
        }
        String textToWrite = readTextFile(inputPath);
        if (textToWrite.isBlank()) {
            throw new FileSystemException("Input file is empty!");
        }

        if (!outputPath.contains(".txt")) {
        outputPath += ".txt";
        }
        File outputFile = new File(outputPath);

        if (!outputFile.exists()) {
            createFile(outputPath);
        }
        if (!outputFile.canWrite()) {
            outputFile.setWritable(true);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write(textToWrite.toUpperCase());
            writer.flush();
        } catch (IOException e) {
            System.err.println("Unexpected problem with writing to file: " + e.getCause());
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