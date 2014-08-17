package threads2.threads6;

import java.util.concurrent.Phaser;

/**
 * Created by USER on 07.07.2014.
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("Starting");
        MyThread myThreadA = new MyThread(phaser, "A");
        MyThread myThreadB = new MyThread(phaser, "B");
        MyThread myThreadC = new MyThread(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("The Phaser is terminated");
        }
    }
}
