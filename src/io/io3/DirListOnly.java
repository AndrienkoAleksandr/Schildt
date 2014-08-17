package io.io3;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by USER on 16.06.2014.
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/java";
        File file = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = file.list(only);
        for (String g: s) {
            System.out.println(g);
        }
    }
}
