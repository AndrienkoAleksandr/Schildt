package threads2.threads9;

import java.util.concurrent.Callable;

/**
 * Created by USER on 07.07.2014.
 */
public class Hypot implements Callable<Double>{
    double a;
    double b;
    public Hypot(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((a*a) + (b*b));
    }
}
