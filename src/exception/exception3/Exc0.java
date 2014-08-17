package exception.exception3;

/**
 * Created by USER on 04.06.2014.
 */
public class Exc0 {
    public static void main(String[] args) {
        int a, d;
        a = 49;
        d = 0;
        try {
            a = a/d;
            System.out.println("We cant ");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        System.out.println("Operation after catch");
    }

}
