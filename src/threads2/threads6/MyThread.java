package threads2.threads6;

import java.util.concurrent.Phaser;

/**
 * Created by USER on 07.07.2014.
 */
public class MyThread implements Runnable{
    String name;
    Phaser phaser;
    public MyThread(Phaser phaser, String name) {
        this.name = name;
        this.phaser = phaser;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " Beginning phase one");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " Beginning phase two");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " Beginning phase three");
        phaser.arriveAndDeregister();
    }
}
