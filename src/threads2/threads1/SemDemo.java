package threads2.threads1;

import java.util.concurrent.Semaphore;

/**
 * Created by USER on 06.07.2014.
 */
public class SemDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new IncThread(semaphore, "A");
        new DecThread(semaphore, "B");
    }
}
