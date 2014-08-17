/**
 * Created by USER on 16.06.2014.
 */
public class Class1 {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.method();
    }
}

class Class2 {
    private int i = 0;
    private int j;
    private int c;

    public void method() {
        j = c = i;
        System.out.println(j + " " + c + " " + i);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

