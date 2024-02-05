package org.task2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Task2 {
    static String pathName = "data.txt";
    static File sourceFile = new File(pathName);
    static SourceFile file = new SourceFile();


    public static void main(String[] args) {
        try {
            if (pathName != null && !pathName.isBlank() && sourceFile.exists()) {
                List<String> text = file.readLines(pathName);
                for (int i = 0; i < text.size(); i += 2) {
                    System.out.println(text.get(i));
                }
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
