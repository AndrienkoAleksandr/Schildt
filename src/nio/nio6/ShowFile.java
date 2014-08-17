package nio.nio6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by USER on 03.07.2014.
 */
public class ShowFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use copy to");
        }
        try (InputStream in = Files.newInputStream(Paths.get(args[0]))) {
            int readByte = 0;
            do {
                readByte = in.read();
                if (readByte != -1) {
                    System.out.print((char)readByte);
                }
            } while (readByte != -1);
        } catch (InvalidPathException e) {
            System.out.println("Path exception" + e);
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}
