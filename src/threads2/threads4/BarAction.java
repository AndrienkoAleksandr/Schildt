package threads2.threads4;

/**
 * Created by USER on 07.07.2014.
 */
public class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Barrier Reached!");
    }
}
