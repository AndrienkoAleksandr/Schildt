package nio.nio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by USER on 03.07.2014.
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileChannel fileChannel = null;
        ByteBuffer buff;
        try {
            fos = new FileOutputStream("test2.txt");
            fileChannel = fos.getChannel();
            buff = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                buff.put((byte)('A' + i));
            }
            buff.rewind();
            fileChannel.write(buff);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        } finally {
            try {
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing Channel.");
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing File.");
            }
        }
    }
}
