package io.io11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * Created by USER on 18.06.2014.
 */
public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        byte[] bytes = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try (PushbackInputStream f = new PushbackInputStream(in)) {
            int c;
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=') {
                        System.out.print(".eq");
                        } else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char)c);
                        break;
                    }
                }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
