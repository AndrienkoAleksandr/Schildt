package io.io12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * Created by USER on 18.06.2014.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumeration ise = new InputStreamEnumeration(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (NullPointerException e) {
            System.out.println("Error Opening File.");
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error Closing SequenceInputStream");
            }
        }
    }
}
