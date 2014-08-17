package autoboxing.autoboxing1;

/**
 * Created by USER on 05.06.2014.
 */
public class Wrap {
    public static void main(String[] args) {
        Integer g = new Integer(3);
        int i = g.intValue();
        System.out.println(i + " Object " + g);
    }
}
