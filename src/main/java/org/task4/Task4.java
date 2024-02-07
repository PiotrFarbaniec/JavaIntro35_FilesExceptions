package org.task4;

public class Task4 {
    static String pathName = "data.txt";
    static TextFormatter4 file = new TextFormatter4();
    public static void main(String[] args) {
        System.out.println(file.isTextContainWord(pathName, "składać"));
    }
}
