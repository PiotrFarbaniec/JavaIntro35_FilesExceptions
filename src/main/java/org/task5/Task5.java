package org.task5;

public class Task5 {

    private static String magenta = "\u001B[35m";
    private static String reset = "\u001B[0m";
    static String pathName = "data.txt";
    static TextFormatter5 file = new TextFormatter5();

    public static void main(String[] args) {

        System.out.println(magenta + file.reverseText(pathName) + reset);
    }
}
