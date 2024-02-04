package org.task6;

public class Task6 {
    static String sourceFile = "data.txt";
    static String destFile = "output.txt";
    static TextFormatter6 f = new TextFormatter6();


    public static void main(String[] args) {
        String text = (f.readTextFile(sourceFile)).toUpperCase();
        f.writeToFile(destFile, text);
    }
}
