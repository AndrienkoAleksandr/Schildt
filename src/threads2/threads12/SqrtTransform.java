package threads2.threads12;

import java.util.concurrent.RecursiveAction;

/**
 * Created by USER on 08.07.2014.
 */
public class SqrtTransform extends RecursiveAction {
    final int seqTreshold = 1000;
    double[] data;
    int end, start;

    public SqrtTransform(double[] nums, int s, int e) {
        data = nums;
        end = e;
        start = s;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqTreshold) {
            for(int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}
