package exception.exception5;

/**
 * Created by USER on 04.06.2014.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            a = 42/a;
            int[] c = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
