package io.io15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by USER on 24.06.2014.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("src/io/io15/FileReaderDemo.java")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println();
        }
    }
}
