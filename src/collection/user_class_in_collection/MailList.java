package collection.user_class_in_collection;

import java.util.LinkedList;

/**
 * Created by USER on 11.06.2014.
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();
        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahome", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));
        for (Address address: ml) {
            System.out.println("element " + address);
        }
    }
}
