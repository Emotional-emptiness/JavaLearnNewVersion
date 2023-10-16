package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamCustom {
    public static void main(String[] args) throws IOException {
        byte[] out = {-128, -127, 1, 4, 127};
        byte[] data = new byte[out.length];
        OutputStream outputStream = new OutputStream() {
            private  int index = 0;
            @Override
            public void write(int b) throws IOException {
                data[index++] = (byte) b;
            }
        };
        outputStream.write(out);
        System.out.println(Arrays.toString(data));
    }
}
