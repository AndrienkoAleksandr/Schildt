package threads.threads4;

import sun.awt.windows.ThemeReader;

/**
 * Created by USER on 30.05.2014.
 */
public class NewThread extends  Thread {

     public NewThread(String threadName) {
         super(threadName);
         System.out.println("New thread: " + getName());
         start();
     }

     @Override
    public void run() {
         for (int i = 5; i > 0; i--) {
             try {
                 System.out.println(getName() + ": " + i);
                 sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println(getName() + " interrupted.");
             }
             System.out.println(getName() + ": " + 1);
         }
         System.out.println(getName() + " exiting.");
    }
}
