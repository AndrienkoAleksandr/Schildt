package io.io12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by USER on 18.06.2014.
 */
public class InputStreamEnumeration implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumeration(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
