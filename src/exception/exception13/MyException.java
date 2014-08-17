package exception.exception13;

/**
 * Created by USER on 04.06.2014.
 */
public class MyException extends Exception{
    public int detail;

    public MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
