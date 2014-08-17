package threads.threads5;

/**
 * Created by USER on 30.05.2014.
 */
public class Callme {
//    synchronized
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
