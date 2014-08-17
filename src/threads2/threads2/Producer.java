package threads2.threads2;

/**
 * Created by USER on 06.07.2014.
 */
public class Producer implements Runnable{
    public Q q;
    Thread thread;
    public Producer(Q q) {
        thread = new Thread(this);
        this.q = q;
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}
