package threads2.threads12;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by USER on 08.07.2014.
 */
public class ForJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        double[] nums = new double[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double)i;
        }
        System.out.println("A portion of the origin sequence:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();

        forkJoinPool.invoke(new SqrtTransform(nums, 0, nums.length));

        System.out.println("A portion of the transformed sequence" +
                " (to four decimal places):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.4f ,", nums[i]);
        }
        System.out.println();
    }
}
