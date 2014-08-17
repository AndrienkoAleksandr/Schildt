package collection.comparator.comparator1;

import java.util.TreeSet;

/**
 * Created by USER on 11.06.2014.
 */
public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("F");
        for (String elem: ts) {
            System.out.println(elem);
        }
    }
}
