package threads.join;

/**
 * Created by USER on 06.07.2014.
 */
public class App {
    public static void main(String[] args) {
        ThreadA a = new ThreadA("Java", 1000);
        ThreadA b = new ThreadA("is amazing language of programming", 2000);
//        b.joinWork = true;

        a.joinThread();
        b.joinThread();
    }
}
