package threads2.threads5;

import java.util.concurrent.Exchanger;

/**
 * Created by USER on 07.07.2014.
 */
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}
