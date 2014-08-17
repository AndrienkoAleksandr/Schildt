package threads2.threads9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by USER on 07.07.2014.
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f1;
        Future<Double> f2;
        Future<Integer> f3;
        System.out.println("Start");
        f1 = executorService.submit(new Factorial(0));
        f2 = executorService.submit(new Hypot(2, 3));
        f3 = executorService.submit(new Sum(2));
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (Exception e) {
            System.out.println(e);
        }
        executorService.shutdown();
        System.out.println("Complete");
    }
}
