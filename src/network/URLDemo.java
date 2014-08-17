package network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by USER on 02.07.2014.
 */
public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.HerbSchildt.com:80/Articals");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("All: " + hp.toExternalForm());
        URLConnection urlConnection = hp.openConnection();
        System.out.println(urlConnection);
    }
}
