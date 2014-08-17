package threads2.threads5;

import java.util.concurrent.Exchanger;

/**
 * Created by USER on 07.07.2014.
 */
public class MakeString implements Runnable{
    Exchanger<String> exgr;
    String str;
    public MakeString(Exchanger<String> exgr) {
        this.exgr = exgr;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char c = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += (char)c++;
            }
            try {
                str = exgr.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(str);
            }
        }

    }
}
