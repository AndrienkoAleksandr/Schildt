package nio.nio1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 02.07.2014.
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        Path path = null;
        int count;
        try {
            path = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Error path");
        }

        try (SeekableByteChannel channel = Files.newByteChannel(path)) {
            ByteBuffer buff = ByteBuffer.allocate(128);

            do {
                count = channel.read(buff);
                if (count != -1) {
                    buff.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buff.get(i));
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
