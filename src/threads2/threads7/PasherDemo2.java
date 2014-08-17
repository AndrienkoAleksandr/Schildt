package threads2.threads7;

/**
 * Created by USER on 07.07.2014.
 */
public class PasherDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);
        MyThread myThread1 = new MyThread(phaser, "A");
        MyThread myThread2 = new MyThread(phaser, "B");
        MyThread myThread3 = new MyThread(phaser, "C");
        MyThread myThread4 = new MyThread(phaser, "D");
        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
        System.out.println("The Phaser is Terminated");
    }
}
