package org.example;

import java.io.*;

public class ReaderExample {
    public static final String ABSOLUTE_PATH = "/home/kali/IdeaProjects/JavaLearnNewVersion/src/main/resources/writer/WriteAndRead.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        checkIfFileAvailable(file);


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("no dota yet\ntilted");
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
//            int ch = reader.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                ch = reader.read();
//            } // это для FileReader reader = new FileReader(file);
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
