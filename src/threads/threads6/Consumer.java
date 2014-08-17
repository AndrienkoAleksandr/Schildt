package threads.threads6;

/**
 * Created by USER on 30.05.2014.
 */
class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
            for (int i = 0; i < 100; i++) {
                q.get();
            }
        }
}
