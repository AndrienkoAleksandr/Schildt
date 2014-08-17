package io.io21;

import java.io.Console;

/**
 * Created by USER on 25.06.2014.
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        con = System.console();
        if (con == null) {
            return;
        }
        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }
}
