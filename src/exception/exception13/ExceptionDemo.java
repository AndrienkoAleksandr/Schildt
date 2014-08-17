package exception.exception13;

import javafx.scene.media.MediaException;

/**
 * Created by USER on 04.06.2014.
 */
public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Вызван compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальное прохождение метода compute");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
