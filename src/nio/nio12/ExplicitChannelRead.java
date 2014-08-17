package nio.nio12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by USER on 03.07.2014.
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count = 0;
        try {
            File file = new File("test.txt");
            fis = new FileInputStream(file);
            fChan = fis.getChannel();
            mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < mBuf.capacity(); i++) {
                        System.out.print((char) mBuf.get(i));
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println("IOException " + e);
        } finally {
            try {
                if (fChan != null) {
                fChan.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing channel");
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing stream");
            }
        }
    }
}
