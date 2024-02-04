package org.task0;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task0 {
    static String [] text = {"Kurs", "Java", "Lekcja 6", "Pliki", "Wyjątki", "Pliki", "Koniec pliku"};

    public static void main(String[] args) {

        File file = new File("data.txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(Path.of("data.txt"));
            if (file.exists() && file.canWrite()) {
                for (int i = 0; i < text.length; i++) {
                    writer.write(text[i]);
                    writer.newLine();
                }
                writer.flush();
            }
        } catch (IOException IOex) {
            IOex.printStackTrace();
        }
    }
}