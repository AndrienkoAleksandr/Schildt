package nio.nio13;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by USER on 03.07.2014.
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileChannel fc = null;
        long fsize;
        MappedByteBuffer mBuff;
        try {
            fis = new FileInputStream("test.txt");
            fc = fis.getChannel();
            fsize = fc.size();
            MappedByteBuffer map = fc.map(FileChannel.MapMode.READ_ONLY, 0, fsize);
            for (int i = 0; i < fsize; i++) {
                System.out.print((char)map.get());
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        } finally {
            try {
                if(fc != null) {
                    fc.close();
                } // close channel
            } catch(IOException e) {
                System.out.println("Error Closing Channel.");
            }
            try {
                if(fis != null) {
                    fis.close();
                } // close file
            } catch(IOException e) {
                System.out.println("Error Closing File.");
            }
        }
    }
}
