package org.example.module10;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// поток байт -> символы
public class InputStreamReaderDemo {
    private static final byte[] INPUT = {72, 101, 108, 111, 32, 119, 111, 114, 108, 100};
    public static void main(String[] args) {

        try (InputStreamReader reader = new InputStreamReader (new ByteArrayInputStream(INPUT));) {
            int read = reader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = reader.read();
            }
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
