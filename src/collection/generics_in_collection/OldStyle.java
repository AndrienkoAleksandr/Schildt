package collection.generics_in_collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by USER on 12.06.2014.
 */
public class OldStyle {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = (String)iterator.next();
            System.out.println(str + " has length: " + str.length() + " symbols");
        }
    }
}
