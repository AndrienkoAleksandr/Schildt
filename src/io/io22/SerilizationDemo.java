package io.io22;

import java.io.*;

/**
 * Created by USER on 25.06.2014.
 */
public class SerilizationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream  objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass myClass = new MyClass("test", 10 , 12.0);
            System.out.println("Object" + myClass);
            objOStrm.writeObject(myClass);
        } catch (IOException e) {
            System.out.println("IOException");
        }
        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass myClass2 = (MyClass)objIStrm.readObject();
            System.out.println("Object" + myClass2);
        } catch (Exception e) {
            System.out.println("IOException");
        }
    }
}
