package threads2.threads13;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by USER on 08.07.2014.
 */
public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;
        if (args.length != 2) {
            System.out.println("Usage: FJExperiment threshold parallism");
            return;
        }
        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] data = new double[1000_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (double)i;
        }
        Transform task = new Transform(data, 0, data.length, threshold);
        long beginT = 0, endT = 0;
        beginT = System.nanoTime();
        fjp.invoke(task);
        endT = System.nanoTime();
        System.out.println("Level of parallelism: " + pLevel);
        System.out.println("Sequential threshold: " + threshold);
        System.out.println("Elapsed time: " + (endT - beginT) + " ns");
        System.out.println();
        System.out.println(fjp.getParallelism());
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}
