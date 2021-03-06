package nio.nio8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by USER on 03.07.2014.
 */
public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("examples\\test.txt");
        System.out.println("File name: " + filePath.getName(1));
        System.out.println("Path: " + filePath);
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());
        if (Files.exists(filePath)) {
            System.out.println("File exist");
        } else {
            System.out.println("File does not exist");
        }
        try {
            if (Files.isHidden(filePath)) {
                System.out.println("File is hidden");
            } else {
                System.out.println("File isn't hidden");
            }
        } catch (IOException e){
            System.out.println("IOException " + e);
        }
        if (Files.isWritable(filePath)) {
            System.out.println("File is writable");
        }
        if (Files.isReadable(filePath)) {
            System.out.println("File is readable");
        }
        try {
            BasicFileAttributes attribs = Files.readAttributes(filePath, BasicFileAttributes.class);
            if (attribs.isDirectory()) {
                System.out.println("The file is a directory");
            } else {
                System.out.println("The file is not a directory");
            }
            if (attribs.isRegularFile()) {
                System.out.println("The file is a normal file");
            } else {
                System.out.println("The file is a symbolic link");
            }
            if (attribs.isSymbolicLink()) {
                System.out.println("The file is a symbolic link");
            } else {
                System.out.println("The file is not a symbolic link");
            }
            System.out.println("File last modified: " + attribs.lastModifiedTime());
            System.out.println("File size: " + attribs.size() + "bytes");
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}
