package collection.list;

import java.util.ArrayList;

/**
 * Created by USER on 10.06.2014.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("begin size a1: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("size al after pasting: " + al.size());
        al.remove("F");
        al.remove(2);
        System.out.println("size after deleting:" + al.size());
        System.out.println("al consist of: " + al);
    }
}
