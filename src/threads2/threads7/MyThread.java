package threads2.threads7;

/**
 * Created by USER on 07.07.2014.
 */
public class MyThread implements Runnable{
    MyPhaser phaser;
    String name;
    public MyThread(MyPhaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("Thread " + name + "Beginning phase" + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
