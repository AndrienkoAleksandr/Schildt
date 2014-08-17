package exception.exception11;

/**
 * Created by USER on 04.06.2014.
 */
public class ThrowDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
