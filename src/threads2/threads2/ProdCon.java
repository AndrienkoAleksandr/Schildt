package threads2.threads2;

/**
 * Created by USER on 06.07.2014.
 */
public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        Consumer consumer = new Consumer(q);
        Producer producer = new Producer(q);
    }
}
