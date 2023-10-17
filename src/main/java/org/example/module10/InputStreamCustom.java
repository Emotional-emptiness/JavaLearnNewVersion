package org.example.module10;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamCustom {
    public static void main(String[] args) throws IOException {
        byte[] input = {1,12,127,2,90,12,11};
        InputStream inputStream = new InputStream() {
            private  int index = 0;
            @Override
            public int read() throws IOException {
                if ( index == input.length) {
                    return -1;
                }
                byte result = input[index];
                index++;
                return result;
            }
        };
//        int data = stream.read();
//        while (data != -1) {
//            System.out.println(data);
//            data = inputStream.read();
//        } считывает байты с массива
        byte[] out = new byte[input.length];
        int read = inputStream.read(out);
        System.out.println(read);
        System.out.println(Arrays.toString(out));
    }
}
