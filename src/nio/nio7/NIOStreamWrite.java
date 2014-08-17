package nio.nio7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by USER on 03.07.2014.
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream stream = Files.newOutputStream(Paths.get("test2.txt"))) {
            for (int i = 0; i < 26; i++) {
                stream.write('A' + i);
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Exception " + e);
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}
