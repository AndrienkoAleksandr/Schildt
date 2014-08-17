package threads2.threads9;

import java.util.concurrent.Callable;

/**
 * Created by USER on 07.07.2014.
 */
public class Factorial implements Callable<Integer>{
    private int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int n = 1;
        for (int i = 2; i <= stop; i++) {
            n *= i;
        }
        return n;
    }
}
