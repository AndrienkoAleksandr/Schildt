package collection.enumset;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by USER on 11.06.2014.
 */
public class EnumSet1 {
    private enum ProcessType { TYPE1, TYPE2 };

    public static void main(String[] args) {
        EnumSet s = EnumSet.of(ProcessType.TYPE1, ProcessType.TYPE2);
        processForTypes(s);
        Apple apple =  Apple.YELLOW;
        Set<Apple> apples = EnumSet.of(apple, Apple.GREEN);
        System.out.println();
        for (Apple ap: apples) {
            System.out.println(ap);
        }
    }

    public static void processForTypes(Set<ProcessType> types) {
        for(ProcessType aType : types) {
            System.out.println(aType);
        }
    }
}
