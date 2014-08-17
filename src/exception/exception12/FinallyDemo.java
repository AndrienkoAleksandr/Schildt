package exception.exception12;

/**
 * Created by USER on 04.06.2014.
 */
public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("внутри finally ProcA");
            throw new RuntimeException("демо");
        } finally {
            System.out.println("блок finally procA");
        }
    }

    static void procB() {
        try {
            System.out.println("внутри ProcB");
            return;
        } finally {
            System.out.println("блок finally procB");
        }
    }

    static void procC() {
        try {
            System.out.println("внутри finally ProcC");
        } finally {
            System.out.println("блок finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
