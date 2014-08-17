package nio.nio15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by USER on 03.07.2014.
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        RandomAccessFile fos = null;
        FileChannel fileChannel = null;
        ByteBuffer buff;
        try {
            fos = new RandomAccessFile("test2.txt", "rw");
            fileChannel = fos.getChannel();
            buff = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                buff.put((byte)('A' + i));
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
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
