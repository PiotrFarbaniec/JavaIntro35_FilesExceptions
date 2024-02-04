package org.task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFormatter1 {

    static String readTextFromFile(String pathName) {
        String readText = null;
        try {
            readText = Files.readString(Path.of(pathName));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return readText;
    }
}