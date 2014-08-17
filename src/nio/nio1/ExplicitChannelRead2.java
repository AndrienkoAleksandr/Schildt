package nio.nio1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by USER on 02.07.2014.
 */
public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;
        try (SeekableByteChannel channel = Files.newByteChannel(Paths.get("test.txt"))) {
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
        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("IOException error");
        }
    }
}
