package io.io18;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by USER on 24.06.2014.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char[] buff = new char[s.length()];
        s.getChars(0, s.length(), buff, 0);
        System.out.println(f.toString());
        try {
            f.write(buff);
        } catch (IOException e) {
            System.out.println("IO Exception");
            return;
        }
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        try (FileWriter fileWriter = new FileWriter("TestCharArrayWriter.txt")) {
            f.writeTo(fileWriter);
        } catch (IOException e) {
            System.out.println("IOException e");
        }
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
