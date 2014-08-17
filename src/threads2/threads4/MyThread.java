package threads2.threads4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by USER on 07.07.2014.
 */
public class MyThread implements Runnable{
    String name;
    CyclicBarrier cyclicBarrier;
    public MyThread(CyclicBarrier cyclicBarrier, String name) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cyclicBarrier.await();
            System.out.println("*");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
