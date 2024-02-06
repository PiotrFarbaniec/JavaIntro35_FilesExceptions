package org.task6;

import java.nio.file.NoSuchFileException;

public class Task6 {
    static String sourceFile = "data.txt";
    static String destFile = "output.txt";
    static TextFormatter6 f = new TextFormatter6();


    public static void main(String[] args) {
        try {
            String text = (f.readTextFile(sourceFile)).toUpperCase();
            System.out.println(text);
            f.writeToFile(destFile, text);
        } catch (NullPointerException e1) {
            System.err.println(e1.getMessage());
        } catch (NoSuchFileException e2) {
            System.err.println(e2.getMessage());
        }
    }
}
