package nio.nio10;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by USER on 03.07.2014.
 */
public class DirList {
    public static void main(String[] args) {
        final String dirname = "examples";
        DirectoryStream.Filter<Path> how =
            new DirectoryStream.Filter<Path>() {
                @Override
                public boolean accept(Path filename) throws IOException {
                    if (Files.isWritable(filename)) {
                        return true;
                    }
                    return false;
                }
            };
        try (DirectoryStream<Path> directoryStream =
            Files.newDirectoryStream(Paths.get(dirname), how)) {
            for (Path elem : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(elem, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("DIR ");
                } else {
                    System.out.print("   ");
                }
                System.out.println(elem.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

