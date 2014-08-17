package threads2.threads3;

import java.util.concurrent.CountDownLatch;

/**
 * Created by USER on 07.07.2014.
 */
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch countDL = new CountDownLatch(5);
        System.out.println("Start");
        MyThread myThread = new MyThread(countDL);
        try {
            countDL.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Complete");
    }
}
