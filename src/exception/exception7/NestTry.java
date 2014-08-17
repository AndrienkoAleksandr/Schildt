package exception.exception7;

/**
 * Created by USER on 04.06.2014.
 */
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            System.out.println("a = " + a);
            try {
                if (a == 1) {
                    a = a/(a - a);
                }
                if (a == 2) {
                    int[] c = { 1 };
                    c[49] = 1;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException");
            }

        }   catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
    }
}
