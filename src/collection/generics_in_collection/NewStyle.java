package collection.generics_in_collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by USER on 12.06.2014.
 */
public class NewStyle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        Iterator<String> iterator = list.iterator();
//        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
//            Integer num = iterator.next();
            String str = iterator.next();
            System.out.println(str + " has length: " + str.length() + " symbols");
        }
    }
}
