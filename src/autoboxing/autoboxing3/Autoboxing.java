package autoboxing.autoboxing3;

/**
 * Created by USER on 05.06.2014.
 */
public class Autoboxing {
    public static int m(Integer i) {
        return i;
    }

    public static void main(String[] args) {
        Integer j = m(100);
        System.out.println(j);
    }
}
