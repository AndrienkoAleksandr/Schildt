package format_text;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by USER on 05.07.2014.
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Time " + sdf.format(date));
        sdf = new SimpleDateFormat("dd MMM yyy hh:mm:ss zzz");
        System.out.println("Time " + sdf.format(date));
        sdf = new SimpleDateFormat("E MMMM dd yyyy");
        System.out.println("Time " + sdf.format(date));
    }
}
