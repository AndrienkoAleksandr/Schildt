package enum_.enum3;

/**
 * Created by USER on 05.06.2014.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap = Apple.Winesap;
        System.out.println("Winesap costs " + ap.getPrice() +
                " cents.\n");
        for (Apple apple: Apple.values()) {
            System.out.println(apple + "cost: " + apple.getPrice() + " cents.");

        }
    }
}
