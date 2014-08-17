package io.io19;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by USER on 25.06.2014.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        char[] buff = new char[s.length()];
        s.getChars(0, s.length(), buff, 0);
        CharArrayReader in = new CharArrayReader(buff);
        try (BufferedReader br = new BufferedReader(in)) {
            int c;
            boolean marker = false;
            while ((c = br.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marker) {
                            marker = true;
                            br.mark(32);
                        } else {
                            marker = false;
                        }
                        break;
                    case ';':
                        if (marker) {
                            marker = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print(c);
                        }
                        break;
                    case ' ':
                        if (marker) {
                            marker = false;
                            br.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char)c);
                        }
                        break;
                    default:
                        if (!marker) {
                            System.out.print((char)c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException e");
        }
    }
}
