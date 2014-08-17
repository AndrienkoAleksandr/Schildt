package threads.threads5;

/**
 * Created by USER on 30.05.2014.
 */
public class Caller implements Runnable{
    Thread t;
    String msg;
    Callme target;

    public Caller(Callme callme, String s) {
        msg = s;
        target = callme;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
//        synchronized (target) {
            target.call(msg);
//        }
    }
}
