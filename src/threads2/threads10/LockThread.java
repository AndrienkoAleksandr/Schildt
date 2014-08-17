package threads2.threads10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by USER on 08.07.2014.
 */
public class LockThread implements Runnable{

    ReentrantLock lock;
    String name;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Start " + name);
        lock.lock();
        System.out.println(name + " lock count");
        Shared.count++;
        System.out.println(name + " " + Shared.count);
        System.out.println(name + " stop");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " unlock count");
        lock.unlock();
    }
}
