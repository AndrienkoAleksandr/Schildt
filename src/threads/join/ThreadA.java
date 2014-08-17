package threads.join;

/**
 * Created by USER on 06.07.2014.
 */
public class ThreadA implements Runnable{
    Thread thread ;
    String text;
    boolean joinWork = false;
    int time;
    public ThreadA(String text, int time) {
        thread = new Thread(this);
        this.text = text;
        this.time = time;
        thread.start();
    }

    @Override
    public void run() {
        try {
            if (joinWork && thread != null) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }

    public void joinThread() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
