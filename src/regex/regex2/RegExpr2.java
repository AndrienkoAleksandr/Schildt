package regex.regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 7");
        System.out.println("Looking for Java in Java 7.");
        if (mat.find()) {
            System.out.println("subsequence found");
        } else {
            System.out.println("No Match");
        }
    }
}
