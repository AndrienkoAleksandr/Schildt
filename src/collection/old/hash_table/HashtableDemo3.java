package collection.old.hash_table;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by USER on 12.06.2014.
 */
public class HashtableDemo3 {
    public static void main(String[] args) {
        Hashtable<String, Double> hm = new Hashtable<String, Double>();
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", 45.8);
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000.0);
        System.out.println("New " + hm.get("John Doe"));
    }
}
