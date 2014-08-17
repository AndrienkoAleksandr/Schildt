package io.io17;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by USER on 24.06.2014.
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int length = s.length();
        char[] buff = new char[length];
        s.getChars(0, length, buff, 0);
        int symbol;
        try(CharArrayReader c = new CharArrayReader(buff)) {
            System.out.println("input1 is:");
            while ((symbol = c.read()) != -1) {
                System.out.print((char)symbol);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        try(CharArrayReader c = new CharArrayReader(buff, 0, 5)) {
            System.out.println("input2 is:");
            while ((symbol = c.read()) != -1) {
                System.out.print((char)symbol);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
