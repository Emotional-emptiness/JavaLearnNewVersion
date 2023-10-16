package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
    public static final String ABSOLUTE_PATH = "/home/kali/IdeaProjects/JavaLearnNewVersion/src/main/resources/print_stream/PrintStream.txt";
    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        checkIfFileAvailable(file);
        try (PrintStream printStream = new PrintStream(file)){
            printStream.println("A");
            printStream.println('a');
            printStream.println(100);
            printStream.println();
            printStream.println("Some text");
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }

    }
    private static void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error " + e.getMessage());
            }
        }
    }
}
