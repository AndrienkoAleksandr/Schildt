package io.io22;

import java.io.Serializable;

/**
 * Created by USER on 25.06.2014.
 */
public class MyClass implements Serializable{
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s = " + s + " i = " + i + " d = " + d;
    }
}
