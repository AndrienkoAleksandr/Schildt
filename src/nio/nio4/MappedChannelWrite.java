package nio.nio4;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

/**
 * Created by USER on 03.07.2014.
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel)Files.newByteChannel(Paths.get("test3.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE)) {
            MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                buff.put((byte)('A' + i));
            }
            channel.write(buff);
        } catch (InvalidPathException e) {
            System.out.println("Path error");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
