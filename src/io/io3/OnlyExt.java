package io.io3;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by USER on 16.06.2014.
 */
public class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
