package threads2.threads8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by USER on 07.07.2014.
 */
public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch c1 = new CountDownLatch(5);
        CountDownLatch c2 = new CountDownLatch(5);
        CountDownLatch c3 = new CountDownLatch(5);
        CountDownLatch c4 = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(2);
        System.out.println("Start");
        service.execute(new MyThread("A", c1));
        service.execute(new MyThread("B", c2));
        service.execute(new MyThread("C", c3));
        service.execute(new MyThread("D", c4));
        try {
            c1.await();
            c2.await();
            c3.await();
            c4.await();
        } catch (Exception e) {
            System.out.println(e);
        }
        service.shutdown();
        System.out.println("Complete");
    }
}
