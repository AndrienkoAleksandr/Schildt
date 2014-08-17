package nio.nio5;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by USER on 03.07.2014.
 */
public class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: Copy from to");
        }
        Path source = Paths.get(args[0]);
        Path target = Paths.get(args[1]);
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("success coping file from " + args[0] + " to " + args[1]);
        } catch (IOException e) {
            System.out.println("IOError" + e);
        }
    }
}
