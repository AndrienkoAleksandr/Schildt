package threads2.threads10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by USER on 08.07.2014.
 */
public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread("A", lock);
        new LockThread("B", lock);
    }
}
