package io.io20;

import io.io17.CharArrayReaderDemo;

import java.io.CharArrayReader;
import java.io.PushbackReader;

/**
 * Created by USER on 25.06.2014.
 */
public class PushBackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        char[] buff = new char[s.length()];
        s.getChars(0, s.length(), buff, 0);
        CharArrayReader in = new CharArrayReader(buff);
        try (PushbackReader f = new PushbackReader(in)) {
            int c;
            while ((c = f.read()) != -1) {
                if (c == '=') {
                    if ((c = f.read()) == '=') {
                        System.out.print(".eq");
                    } else {
                        System.out.print("<-");
                        f.unread(c);
                    }
                } else {
                    System.out.print((char)c);
                }
            }
        } catch (Exception e) {
            System.out.println("IO Exception");
        }
    }
}
