package exception.exception14;

/**
 * Created by USER on 04.06.2014.
 */
public class ChainExcDemo {

    private static void demoProc() {
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("что то случилось"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("причина " + e.getCause());
        }
    }
}
