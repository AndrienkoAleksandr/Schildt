package reflection.reflection1;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by USER on 04.07.2014.
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            Constructor[] constructors = c.getConstructors();
            System.out.println("Constructors: ");
            for (Constructor constr : constructors) {
                System.out.println(constr);
            }
            Field[] fields = c.getFields();
            System.out.println("Fields");
            for (Field field: fields) {
                System.out.println(field);
            }
            Method[] methods = c.getMethods();
            System.out.println("Methods");
            for (Method method: methods) {
                System.out.println(method);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}