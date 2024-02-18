package org.task4;

public class MainClass {
    static String pathName = "data.txt";
    static WordSearcher file = new WordSearcher();
    public static void main(String[] args) {
        System.out.println(file.isTextContainWord(pathName, "składać"));
    }
}
