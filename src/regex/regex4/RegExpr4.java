package regex.regex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 04.07.2014.
 */
public class RegExpr4 {
    public static void main(String[] args) {
        Pattern  pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");
        while (mat.find()) {
            System.out.println("Match: " + mat.group());
        }
    }
}
