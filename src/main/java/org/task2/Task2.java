package org.task2;

import java.io.IOException;

public class Task2 {
    static String pathName = "data.txt";
    static SourceFile file = new SourceFile();

    public static void main(String[] args) {
        try {
            for (int i = 0; i < file.readLines(pathName).size() ; i+=2) {
                System.out.println(file.readLines(pathName).get(i));
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
