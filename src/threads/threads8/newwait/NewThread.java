package threads.threads8.newwait;

/**
 * Created by USER on 04.06.2014.
 */
public class NewThread implements Runnable {
    Thread t;
    String name;
    boolean suspendFlag;

    public NewThread(String threadName) {
        t = new Thread(this, threadName);
        name = threadName;
        System.out.println("new Thread" + t.getName());
        t.start();
    }

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " completed");
    }

    public void mySuspend() {
        suspendFlag = true;
    }

    public void myResume() {
        suspendFlag = true;
    }
}
