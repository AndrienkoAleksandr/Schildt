package nio.nio2;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by USER on 02.07.2014.
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel)Files.newByteChannel(Paths.get("test.txt"))) {
            long size = channel.size();
            MappedByteBuffer mbb = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for (long i = 0; i < size; i++) {
                System.out.print((char)mbb.get());
            }
        } catch (InvalidPathException e) {
            System.out.println("Path error");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
