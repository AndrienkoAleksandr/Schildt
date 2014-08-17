package collection.some_Algoritms_collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by USER on 11.06.2014.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        Collections.sort(ll);
        for (Integer i: ll) {
            System.out.println(i);
        }
        System.out.println();
        Comparator r = Collections.reverseOrder();
        Collections.sort(ll, r);
        for (Integer i: ll) {
            System.out.println(i);
        }
        System.out.println();
        Collections.shuffle(ll);
        for (Integer i: ll) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("max " + Collections.max(ll));
        System.out.println("min " + Collections.min(ll));
    }
}
