package collection.comparator.comparator2;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by USER on 11.06.2014.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new CompT());
        tm.put("John Doe", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Tod Hall", new Double(99.22));
        tm.put("Ralph Smith", new Double(-19.08));
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> elem: set) {
            System.out.println(elem.getKey() + " " + elem.getValue());
        }
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " +
                tm.get("John Doe"));
    }
}
