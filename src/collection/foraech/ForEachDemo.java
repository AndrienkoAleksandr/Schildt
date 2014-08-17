package collection.foraech;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by USER on 11.06.2014.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        Integer[] t = new Integer[]{1, 2,};
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        for (Integer val: vals) {
            System.out.println(val);
        }
        int sum = 0;
        for (Integer val: vals) {
            sum += val;
        }
        System.out.println("sum = " + sum);
    }
}
