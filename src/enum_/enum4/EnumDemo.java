package enum_.enum4;

import enum_.enum3.*;

/**
 * Created by USER on 05.06.2014.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple app1, app2, app3;
        for (Apple apple: Apple.values()) {
            System.out.println(apple + " " + apple.ordinal());
        }
        app1 = Apple.RedDel;
        app2 = Apple.GoldenDel;
        app3 = Apple.RedDel;

        System.out.println();
        if (app1.compareTo(app2) < 0) {
            System.out.println(app1 + " comes before " + app2);
        }
        if (app1.compareTo(app2) > 0) {
            System.out.println(app2 + " comes before " + app1);
        }
        if (app1.compareTo(app3) == 0) {
            System.out.println(app1 + " equals " + app3);
        }
        System.out.println();
        if (app1.equals(app2)) {
            System.out.println("Error!");
        }
        if (app1.equals(app3)) {
            System.out.println(app1 + " equals " + app3);
        }
        if (app1 == app3) {
            System.out.println(app1 + " == " + app3);
        }
    }
}
