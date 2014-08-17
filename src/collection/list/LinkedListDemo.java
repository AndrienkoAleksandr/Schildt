package collection.list;

import java.util.LinkedList;

/**
 * Created by USER on 10.06.2014.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("begin state:" + ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("state after deleting" + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After deleting first and last: " + ll);
        String val = ll.get(2);
        ll.set(2, val + " changed");
        System.out.println("ll after changed " + ll);
    }
}
