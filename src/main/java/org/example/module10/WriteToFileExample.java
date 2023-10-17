package org.example.module10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    public static final String ABSOLUTE_PATH = "/home/kali/IdeaProjects/JavaLearnNewVersion/src/main/resources/out/file1.txt";
    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
//        System.out.println("file.getName() = " + file.getName());
        if ( !file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error" + e.getMessage());
            }
        }

        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            for ( int i = 0; i < 1000; i++) {
                String content = "This we will add to a file, Hello from Linux " + " || " + "number: "+ i + "\n";
                bufferedOutputStream.write(content.getBytes());
            }
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
/*
для работы с файлами лучше использовать :
    BufferedOutputStream
    and
    BufferedInputStream
    они экономят много ресурсов!
 */
