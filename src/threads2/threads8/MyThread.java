package threads2.threads8;

import java.util.concurrent.CountDownLatch;

/**
 * Created by USER on 07.07.2014.
 */
public class MyThread implements Runnable {
    String name;
    CountDownLatch countDownLatch;
    public MyThread(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ":" + i);
            countDownLatch.countDown();
        }
    }
}
