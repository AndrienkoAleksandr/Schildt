package autoboxing.autoboxing5;

/**
 * Created by USER on 06.06.2014.
 */
public class Autoboxing {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = iOb + dOb;
        System.out.println("dOb after expression: " + dOb);
    }
}
