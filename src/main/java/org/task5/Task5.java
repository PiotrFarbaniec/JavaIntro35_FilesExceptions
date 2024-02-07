package org.task5;

public class Task5 {

    static String pathName = "data.txt";
    static ReverseConverter file = new ReverseConverter();

    public static void main(String[] args) {

        System.out.println(file.reverseText(pathName));
    }
}
