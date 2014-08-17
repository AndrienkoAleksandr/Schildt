package threads2.threads13;

import java.util.concurrent.RecursiveAction;

/**
 * Created by USER on 08.07.2014.
 */
public class Transform extends RecursiveAction {
    final int seqTreshold;
    int start, end;
    double[] data;
    public Transform(double[] data, int s, int e, int seqTreshold) {
        start = s;
        end = e;
        this.seqTreshold = seqTreshold;
        this.data = data;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqTreshold) {
            for (int i = start; i < end; i++) {
                if (data[i] % 2 == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        } else {
            int middle = (end + start) / 2;
            invokeAll(new Transform(data, start, middle, seqTreshold),
                    new Transform(data, middle, end, seqTreshold));
        }

    }
}
