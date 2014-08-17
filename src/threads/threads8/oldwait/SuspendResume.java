package threads.threads8.oldwait;

/**
 * Created by USER on 04.06.2014.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread o1 = new NewThread("Thread one");
        NewThread o2 = new NewThread("Thread two");
        try {
            Thread.sleep(10000);
            o1.t.suspend();
            System.out.println("thread" + o1.t.getName() + " wait");
            Thread.sleep(1000);
            o1.t.resume();
            System.out.println("thread" + o1.t.getName() + " run again");
            o2.t.suspend();
            System.out.println("thread" + o2.t.getName() + " wait");
            Thread.sleep(1000);
            o2.t.resume();
            System.out.println(("thread" + o2.t.getName() + " run again"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
