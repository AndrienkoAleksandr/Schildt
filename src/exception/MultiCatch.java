package exception;

/**
 * Created by USER on 04.06.2014.
 */
public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 49/0;
            int[] c = new int[]{1};
            c[19] = 8;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("обрабатываемые исключения " + e);
        }
        System.out.println("После мультиобработчика");
    }
}
