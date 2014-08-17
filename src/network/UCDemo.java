package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by USER on 02.07.2014.
 */
public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d != 0) {
            System.out.println("Date: " + new Date(d));
        } else {
            System.out.println("no Date");
        }
        System.out.println("Content Type " + hpCon.getContentType());
        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("No expiration information.");
        } else {
            System.out.println("Expiration: " + new Date(d));
        }
        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("Last modified information.");
        } else {
            System.out.println("Last modified: " + new Date(d));
        }
        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("Content length unavailable.");
        } else {
            System.out.println("Content-Length: " + len);
        }
        if (len != 0) {
            System.out.println("=== Content ===");
            InputStream in = hpCon.getInputStream();
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
        } else {
            System.out.println("No content available.");
        }
    }
}
