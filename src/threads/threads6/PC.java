package threads.threads6;

/**
 * Created by USER on 30.05.2014.
 */
public class PC {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
