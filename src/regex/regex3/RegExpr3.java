package regex.regex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExpr3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 4 5 6 test");
        while (mat.find()) {
            System.out.println("test finded with index " + mat.start());
        }
    }
}
