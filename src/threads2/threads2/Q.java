package threads2.threads2;

import java.util.concurrent.Semaphore;

/**
 * Created by USER on 06.07.2014.
 */
public class Q {
    Semaphore semCon = new Semaphore(0);
    Semaphore semProd = new Semaphore(1);
    int n = 0;
    public void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("get " + n);
        semProd.release();
    }

    public void put(int i) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        n = i;
        System.out.println("send " +i);
        semCon.release();
    }
}
