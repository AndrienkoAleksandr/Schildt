package threads2.threads14;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by USER on 08.07.2014.
 */
public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] data = new double[5000];
        for (int i = 0; i < data.length; i++ ) {
            data[i] = (i % 2 == 0) ? i : -i;
        }
        Sum sum = new Sum(data, 0, data.length);
        double sumation = fjp.invoke(sum);
        System.out.println("Summation: " + sumation);
    }
}
