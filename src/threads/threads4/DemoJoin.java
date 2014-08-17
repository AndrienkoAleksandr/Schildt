package threads.threads4;

/**
 * Created by USER on 30.05.2014.
 */
public class DemoJoin {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread One is alive: "
                + ob1.isAlive());
        System.out.println("Thread Two is alive: "
                + ob2.isAlive());
        System.out.println("Thread Three is alive: "
                + ob3.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.join();
            ob2.join();
            ob3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: "
                + ob1.isAlive());
        System.out.println("Thread Two is alive: "
                + ob2.isAlive());
        System.out.println("Thread Three is alive: "
                + ob3.isAlive());
        System.out.println("Main thread exiting.");
    }
}
