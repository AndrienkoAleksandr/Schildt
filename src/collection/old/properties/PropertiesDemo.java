package collection.old.properties;

import java.util.Properties;
import java.util.Set;

/**
 * Created by USER on 13.06.2014.
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");
        Set<?> states = capitals.keySet();
        for (Object name: states) {
            System.out.println("The capital of " + name +
            " " + capitals.get((String)name));
        }
        System.out.println();

        // Look for state not in list -- specify default.
        String str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}
