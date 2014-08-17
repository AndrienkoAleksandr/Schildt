package threads2.threads4;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by USER on 07.07.2014.
 */
public class BarDemo3 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Start");
        MyThread myThread1 = new MyThread(cyclicBarrier, "A");
        MyThread myThread2 = new MyThread(cyclicBarrier, "B");
        MyThread myThread3 = new MyThread(cyclicBarrier, "C");
        System.out.println("Doom forever");
        MyThread myThread4 = new MyThread(cyclicBarrier, "X");
        MyThread myThread5 = new MyThread(cyclicBarrier, "Y");
        MyThread myThread6 = new MyThread(cyclicBarrier, "Z");
    }
}
