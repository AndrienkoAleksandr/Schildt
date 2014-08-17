package collection.queue;

import java.util.ArrayDeque;

/**
 * Created by USER on 11.06.2014.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.push("B");
        adq.push("A");
        adq.push("D");
        adq.push("E");
        adq.push("C");
        adq.push("F");
        System.out.println("push from stack: ");
        while (adq.peek() != null) {
            System.out.println(adq.pop() + "");
        }
    }
}
