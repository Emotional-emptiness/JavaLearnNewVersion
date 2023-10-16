package org.example;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIleExample {
    public static final String ABSOLUTE_PATH = "/home/kali/IdeaProjects/JavaLearnNewVersion/src/main/resources/file.txt";
    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);

        if (!file.exists()) {
            throw new RuntimeException("File with name" + file.getName() + " not exists");
        }

        try (FileInputStream inputStream = new FileInputStream(ABSOLUTE_PATH);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) { // можно сократить до одной строки, но для пирмера оставлю так
            int read = bufferedInputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = bufferedInputStream.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
