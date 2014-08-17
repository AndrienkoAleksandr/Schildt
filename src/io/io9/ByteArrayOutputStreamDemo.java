package io.io9;

import java.io.*;

/**
 * Created by USER on 18.06.2014.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        String s = "This should end up in the array";
        byte[] temp = s.getBytes();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            stream.write(temp);
        } catch (IOException e) {
            System.out.println("Error Writing to Buffer");
            return;
        }
        System.out.println("Buffer as a string");
        System.out.println(stream.toString());
        System.out.println("Into Array");
        byte[] bytes = stream.toByteArray();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]);
        }
        System.out.println("\nTo an OutputStream()");
        try(FileOutputStream file = new FileOutputStream("test.txt")) {
            stream.writeTo(file);
        } catch(IOException e)  {
            System.out.println("I/O Error: " + e);
            return;
        }
        System.out.println("Doing a reset");
        stream.reset();
        for (int i = 0; i < 3; i++) {
            stream.write('X');
        }
        System.out.println(stream.toString());
    }
}
