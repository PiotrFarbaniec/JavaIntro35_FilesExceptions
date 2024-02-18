package org.task2;

import java.io.IOException;
import java.util.List;

public class Task2 {
    static String pathName = "data.txt";
    static SourceFile file = new SourceFile();


    public static void main(String[] args) {
        List<String> text;
        try {
            text = file.readLines(pathName);
            for (int i = 0; i < text.size() ; i+=2) {
                System.out.println(text.get(i));
            }
        } catch (NullPointerException e1) {
            System.err.println(e1.getMessage());
            e1.printStackTrace();
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
    }
}

