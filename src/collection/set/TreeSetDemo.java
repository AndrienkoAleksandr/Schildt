package collection.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by USER on 11.06.2014.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("F");
        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
