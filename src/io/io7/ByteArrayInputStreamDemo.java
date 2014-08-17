package io.io7;

import java.io.ByteArrayInputStream;

/**
 * Created by USER on 18.06.2014.
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] bytes = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(bytes);
        ByteArrayInputStream input2 = new ByteArrayInputStream(bytes, 0, 3);
    }
}
