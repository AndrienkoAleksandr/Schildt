package exception.exception2;

/**
 * Created by USER on 04.06.2014.
 */
public class Exc0 {
    static void subroutine() {
        int d = 0;
        int i = 49/d;
    }

    public static void main(String[] args) {
        Exc0.subroutine();
    }
}
