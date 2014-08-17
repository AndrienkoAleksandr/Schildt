package threads.callable;

import java.util.concurrent.Callable;

/**
 * Created by USER on 05.07.2014.
 */
public class Application {
    public static void main(String[] args) {
        CallableSample call1 = new CallableSample();
        call1.checking = 0;
        CallableSample call2 = new CallableSample();
        call2.checking = 7;
        CallableSample call3 = new CallableSample();
        call3.checking = 8;
        CallableSample call4 = new CallableSample();
        call4.checking = 0;
        startThread(call1);
        startThread(call2);
        startThread(call3);
        startThread(call4);
    }

    public static void startThread(Callable c) {
        try {
            c.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
