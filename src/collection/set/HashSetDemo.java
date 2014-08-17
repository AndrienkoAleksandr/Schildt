package collection.set;

import java.util.HashSet;

/**
 * Created by USER on 11.06.2014.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
