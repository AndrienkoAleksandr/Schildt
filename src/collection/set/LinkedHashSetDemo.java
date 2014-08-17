package collection.set;

import java.util.LinkedHashSet;

/**
 * Created by USER on 11.06.2014.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("B");
        ls.add("A");
        ls.add("D");
        ls.add("E");
        ls.add("C");
        ls.add("F");
        System.out.println(ls);
    }
}
