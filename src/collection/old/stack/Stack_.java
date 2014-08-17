package collection.old.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by USER on 12.06.2014.
 */
public class Stack_ {
    static void snowPush(Stack<Integer> stack, int a) {
        stack.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }
    static void snowPop(Stack<Integer> stack) {
        int a = stack.pop();
        System.out.println(a);
        System.out.println("stack: " + stack);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        snowPush(st, 42);
        snowPush(st, 66);
        snowPush(st, 99);
        snowPop(st);
        snowPop(st);
        snowPop(st);

        try {
            snowPop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
