package synchronized_collection;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * Created by USER on 15.07.2014.
 */
public class ThreadForList implements Callable<Long> {
    private List list;
    private int begin;
    private int end;
    private CountDownLatch countDownLatch;
    public ThreadForList(int begin, int end, List list, CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        countDownLatch.await();
        long begin = System.nanoTime();
        for (int i = this.begin; i < this.end; i++) {
            list.get(i);
        }
        long end = System.nanoTime();
        return end - begin;
    }
}
