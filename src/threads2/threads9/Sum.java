package threads2.threads9;

import java.util.concurrent.Callable;

/**
 * Created by USER on 07.07.2014.
 */
public class Sum implements Callable<Integer>{
    int stop;
    public Sum(int n) {
        stop = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
