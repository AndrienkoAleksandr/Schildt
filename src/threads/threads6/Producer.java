package threads.threads6;

/**
 * Created by USER on 30.05.2014.
 */
public class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
            int i = 0;
            for (int j = 0; j < 100; j++) {
                q.put(i++);
            }
        }
}
