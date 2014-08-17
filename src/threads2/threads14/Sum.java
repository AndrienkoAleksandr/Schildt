package threads2.threads14;

import java.util.concurrent.RecursiveTask;

/**
 * Created by USER on 08.07.2014.
 */
public class Sum extends RecursiveTask<Double> {
    final int seqTreshHold = 500;
    double[] data;
    int start, end;
    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqTreshHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum sum1 = new Sum(data, start, middle);
            Sum sum2 = new Sum(data, middle, end);
            sum1.fork();
            sum2.fork();
            sum = sum1.join() + sum2.join();
        }
        return sum;
    }
}
