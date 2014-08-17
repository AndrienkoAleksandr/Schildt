package exception.exception10;

/**
 * Created by USER on 04.06.2014.
 */
public class ThrowsDemo {
    static void throwOne() {
        System.out.println("Inside throwOne.");
//        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        throwOne();
    }
}
