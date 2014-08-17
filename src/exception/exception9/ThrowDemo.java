package exception.exception9;

/**
 * Created by USER on 04.06.2014.
 */
public class ThrowDemo {
    public static void demoProg() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoProc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProg();
        } catch (NullPointerException e) {
            System.out.println("Caught again");
        }
    }
}
