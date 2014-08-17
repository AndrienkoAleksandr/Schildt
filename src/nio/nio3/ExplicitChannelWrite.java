package nio.nio3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by USER on 02.07.2014.
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test2.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)) {
            ByteBuffer buff = ByteBuffer.allocate(26);
            int r = 9;
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 26; i++) {
                    buff.put((byte)('A' + i));
                }
                buff.rewind();
//                buff.flip();
                channel.write(buff, r);
                r = 26 + r;
                buff.rewind();
                buff.flip();
            }
        } catch (InvalidPathException e) {
            System.out.println("Path error");
        } catch (IOException e) {
            System.out.println("IOError e");
        }
    }
}
