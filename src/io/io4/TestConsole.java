package io.io4;

/**
 * Created by USER on 18.06.2014.
 */
public class TestConsole {
    public static void main(String[] args) {
        String asciiColors = (char)27 + "[2;2x TEXT";
        System.out.println("asciiColors = " + asciiColors);
    }
}
