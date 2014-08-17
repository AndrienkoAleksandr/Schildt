/**
 * Created by USER on 12.06.2014.
 */
public class ObjectMethods {
    public static void main(String[] args) {
        Object object = new Object();
        Object ob2 = new Object();
        object.equals(ob2);
        System.out.println("object.hashCode() " + object.hashCode());
        System.out.println("ob.toString() " + object.toString());
        System.out.println("object.getClass() " + object.getClass());
        ObjectMethods.TestThread testThread = new ObjectMethods.TestThread(object);
        ObjectMethods.TestThread testThread2 = new ObjectMethods.TestThread(object);
        testThread.start();
        testThread2.start();
    }

    public static class TestThread extends Thread{
        private Object object;

        public TestThread(Object object) {
            super();
            this.object = object;
        }

        @Override
        public void run() {
            synchMethod(object);
        }

        public synchronized void synchMethod(Object object) {
//            try {
//                System.out.println("Wait 100 ms");
//                object.wait(1000);
//                System.out.println("Wait 100ms 333ns");
//                object.wait(1000, 333);
//                System.out.println("Wait");
//                object.wait();
//                object.notify();
//                System.out.println("begin");
//                object.wait();
//                object.notifyAll();
//                System.out.println("lets go");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            for (int i = 0; i <10; i++) {
//                System.out.println(i);
//            }
        }
    }


}
