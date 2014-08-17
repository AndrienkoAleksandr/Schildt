package threads2.threads11;

import sun.security.provider.SHA;

/**
 * Created by USER on 08.07.2014.
 */
public class AtomThread implements Runnable{
    String name;

    public AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(name + " " + Shared.ai.getAndSet(i));
        }
    }
}
