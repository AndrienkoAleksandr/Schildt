package network;

import java.net.*;
import java.net.UnknownHostException;

/**
 * Created by USER on 02.07.2014.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        address = InetAddress.getByName("www.youtube.com");
        System.out.println(address);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }

        InetAddress[] youtube = InetAddress.getAllByName("www.youtube.com");
        for (int i = 0; i < youtube.length; i++) {
            System.out.println(youtube[i]);
        }
    }
}
