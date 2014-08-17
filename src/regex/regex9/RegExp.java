package regex.regex9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExp {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ .,!]");
        String[] str = pat.split("one two,alpha9 12!done.");
        for (String s: str) {
            System.out.println("Next split " + s);
        }
    }
}
