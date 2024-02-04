package org.task1;

public class Task1 {
    static final String pathName = "data.txt";

    public static void main(String[] args) {

        System.out.println(TextFormatter1.readTextFromFile(pathName));
    }
}