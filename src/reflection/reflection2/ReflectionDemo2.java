package reflection.reflection2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by USER on 04.07.2014.
 */
public class ReflectionDemo2 {
    public static void main(String[] args) {
        A a = new A();
        Class<?> c = a.getClass();
        System.out.println("Opened methods ");
        Method[] methods = c.getDeclaredMethods();
        for (Method method: methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.println(method.getName() + " is public");
            }
        }
    }
}
