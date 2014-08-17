package collection.old.hash_table;

import java.util.*;

/**
 * Created by USER on 12.06.2014.
 */
public class HashtableDemo1 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        balance.put("John Doe", new Double(3434.34));
        balance.put("Tom Smith", new Double(123.22));
        balance.put("Jane Baker", 45.8);
        balance.put("Tod Hall", new Double(99.22));
        balance.put("Ralph Smith", new Double(-19.08));
        Enumeration<String> names = balance.keys();
        String name;
        while (names.hasMoreElements()){
            name = names.nextElement();
            System.out.println(name + ": " +
                    balance.get(name));
        }
        System.out.println();
        double bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000.0);
        System.out.println("New " + balance.get("John Doe"));
    }
}
