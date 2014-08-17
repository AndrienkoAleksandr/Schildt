package threads;

/**
 * Created by USER on 06.07.2014.
 */
public class TwoThreadWithJoin {
    public static class Thread1 extends Thread {

        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
            System.out.println("B");
        }
    }

    public static class Thread2 extends Thread {

        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1");
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <  10; i++) {
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            thread1.start();
            thread2.start();
            System.out.println();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }
}
