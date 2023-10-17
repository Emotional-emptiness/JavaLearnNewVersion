package org.example.module10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// поток символов -> байт
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArray))
        {
            outputStreamWriter.write("Untitled text");
            outputStreamWriter.flush();
            System.out.println(Arrays.toString(byteArray.toByteArray()));
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
