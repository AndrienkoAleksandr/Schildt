package enum_.enum2;

/**
 * Created by USER on 05.06.2014.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants");
        Apple[] apples = Apple.values();
        for (Apple apple: apples) {
            System.out.println(apple);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }

}
