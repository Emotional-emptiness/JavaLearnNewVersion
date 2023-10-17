package org.example.module10;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static final String ABSOLUTE_PATH = "/home/kali/IdeaProjects/JavaLearnNewVersion/src/main/resources/writer/WriteAndRead.txt";
    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);

        try (PrintWriter printWriter = new PrintWriter(System.out)) {
            printWriter.println("java\njava");
        }
    }
}
