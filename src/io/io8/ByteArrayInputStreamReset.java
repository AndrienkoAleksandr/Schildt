package io.io8;

import java.io.ByteArrayInputStream;

/**
 * Created by USER on 18.06.2014.
 */
public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte[] bytes = tmp.getBytes();
        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = stream.read()) != -1) {
                if (i == 0) {
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            stream.reset();
        }
    }
}
