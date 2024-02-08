package org.task6;

public class MainClass {
    static String sourceFile = "data.txt";
    static String destFile = "output";
    static UpperCaseConverter f = new UpperCaseConverter();


    public static void main(String[] args) {
        try {
            f.capitalizeFileContent(sourceFile, destFile);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
