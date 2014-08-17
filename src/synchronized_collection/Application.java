package synchronized_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by USER on 15.07.2014.
 */
public class Application {
    public static void main(String[] args) throws Exception {
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());
        CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<Integer>();
        fillList(list1, 100);
        fillList(list2, 100);
        check(list1);
        check(list2);
    }

    public static void fillList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    private static void check(List list) throws ExecutionException, InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int middle = list.size()/2;
        ThreadForList thread1 = new ThreadForList(0, middle, list, countDownLatch);
        ThreadForList thread2 = new ThreadForList(middle, list.size(), list,countDownLatch);
        ExecutorService service = Executors.newFixedThreadPool(2);
        countDownLatch.countDown();
        System.out.println(service.submit(thread1).get() + service.submit(thread2).get());
        service.shutdown();
    }
}
