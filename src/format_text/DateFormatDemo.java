package format_text;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by USER on 05.07.2014.
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.forLanguageTag("ua"));
        System.out.println("Ukraine " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States: " + df.format(date));
    }
}
