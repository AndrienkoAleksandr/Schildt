package threads2.threads5;

import java.util.concurrent.Exchanger;

/**
 * Created by USER on 07.07.2014.
 */
public class UseString implements Runnable{
    Exchanger<String> exgr;
    String str;
    public UseString(Exchanger<String> exgr) {
        this.exgr = exgr;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = exgr.exchange(new String());
                System.out.println("Recieved " + str);
            } catch (InterruptedException e) {
                System.out.println(exgr);
            }
        }
    }
}
