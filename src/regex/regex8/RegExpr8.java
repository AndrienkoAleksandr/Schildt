package regex.regex8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExpr8 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*?");
        System.out.println("Original sequence: " + str);
        Matcher mat = pat.matcher(str);
        str = mat.replaceAll("Eric");
        System.out.println(str);
    }
}
