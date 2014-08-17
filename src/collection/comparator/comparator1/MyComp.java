package collection.comparator.comparator1;

import java.util.Comparator;

/**
 * Created by USER on 11.06.2014.
 */
public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String a = o1;
        String b = o2;
        return b.compareTo(a);
    }
}
