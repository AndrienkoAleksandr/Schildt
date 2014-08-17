package nio.nio11;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 03.07.2014.
 */
public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "examples";
        System.out.println("Directory tree starting with " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
