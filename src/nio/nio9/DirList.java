package nio.nio9;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by USER on 03.07.2014.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "examples";
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory of " + dirname);
            for (Path entry : dirStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("DIR ");
                }  else {
                    System.out.print("    ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e ) {
            System.out.println("Invalid path");
        } catch (NotDirectoryException e) {
            System.out.println("No such Directory");
        }
        catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}
