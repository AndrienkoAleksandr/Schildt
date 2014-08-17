package threads2.threads1;

import java.util.concurrent.Semaphore;

/**
 * Created by USER on 06.07.2014.
 */
public class DecThread implements Runnable{
    Semaphore semaphore;
    String name;
    public DecThread(Semaphore semaphore, String name) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        System.out.println(name + " is waiting for a permit.");
        try {
            semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                System.out.println(Shared.count--);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " gets a permit.");
        semaphore.release();
    }
}
