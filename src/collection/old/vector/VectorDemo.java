package collection.old.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by USER on 12.06.2014.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after four additions: " +
                v.capacity());
        v.addElement(5);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(6);
        v.addElement(7);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First element = " + v.firstElement());
        System.out.println("Last element = " + v.lastElement());
        if (v.contains(3)) {
            System.out.println("Vector contains 3.");
            // Enumerate the elements in the vector.
        }
        Enumeration<Integer> en = v.elements();
        System.out.println("\nElements in vector:");
        while (en.hasMoreElements())  {
            System.out.print(en.nextElement() + " ");
        }
        // Use an iterator to display contents.
        Iterator<Integer> vItr = v.iterator();

        System.out.println("\nElements in vector:");
        while(vItr.hasNext())
            System.out.print(vItr.next() + " ");

        // Use an enhanced for loop to display contents.
        System.out.println("\nElements in vector:");
        for(int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
