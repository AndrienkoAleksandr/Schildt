package threads.callable;

import java.util.concurrent.*;

/**
 * Created by USER on 05.07.2014.
 */
public class ExecutorServiceSample {
    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(5);
        CallableSample call1 = new CallableSample();
        call1.checking = 6;
        CallableSample call2 = new CallableSample();
        call2.checking = 7;
        CallableSample call3 = new CallableSample();
        call3.checking = 0;
        CallableSample call4 = new CallableSample();
        call4.checking = 8;
        Future fut1 = exs.submit(call1);
        Future fut2 = exs.submit(call2);
        Future fut3 = exs.submit(call3);
        Future fut4 = exs.submit(call4);
        startThread(fut1);
        startThread(fut2);
        startThread(fut3);
        startThread(fut4);
//        while (!fut1.isDone() && !fut1.isDone() && !fut1.isDone() && !fut1.isDone()) {
//
//        }
        exs.shutdown();
    }

    public static void startThread(Future future) {
        while (!future.isDone()) {
        }
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
