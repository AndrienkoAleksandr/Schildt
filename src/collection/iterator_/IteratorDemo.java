package collection.iterator_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by USER on 11.06.2014.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("begin element");
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.print(elem);
        }
        System.out.println();
        ListIterator<String> lt = al.listIterator();
        while (lt.hasNext()) {
            String listElem = lt.next();
            lt.set(listElem + "+");
        }
        System.out.println("after modified: ");
        iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        while (lt.hasPrevious()) {
            String elem = lt.previous();
            System.out.print(elem);
        }
    }
}
