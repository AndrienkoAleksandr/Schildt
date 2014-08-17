package regex.regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();
        System.out.println("Testing Java against Java.");
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }
        System.out.println();
        mat = pat.matcher("Java 7");
        found = mat.matches();
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }
    }
}
