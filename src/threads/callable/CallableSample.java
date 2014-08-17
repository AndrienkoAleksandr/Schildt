package threads.callable;

import java.util.concurrent.Callable;

/**
 * Created by USER on 05.07.2014.
 */
public class CallableSample implements Callable{
    public int checking;
    @Override
    public String call() throws Exception {
        if (checking == 0) {
            throw new Exception("some error");
        }
        System.out.println("Is processing");
        return String.valueOf(checking);
    }
}
