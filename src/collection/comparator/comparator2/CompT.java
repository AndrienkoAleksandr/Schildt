package collection.comparator.comparator2;

import java.util.Comparator;

/**
 * Created by USER on 11.06.2014.
 */
public class CompT implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = o1.lastIndexOf(' ');
        int j = o2.lastIndexOf(' ');
        int k = 0;
        k = o1.substring(i).compareTo(o2.substring(j));
        if (k == 0) {
            k = o1.compareTo(o2);
        }
        return k;
        //or
//        int i, j, k;
//        String aStr, bStr;
//        aStr = o1;
//        bStr = o2;
//        // Find index of beginning of last name.
//        i = aStr.lastIndexOf(' ');
//        j = bStr.lastIndexOf(' ');
//        k = aStr.substring(i).compareTo(bStr.substring(j));
//        if(k==0) // last names match, check entire name
//            return aStr.compareTo(bStr);
//        else
//            return k;
    }
}
