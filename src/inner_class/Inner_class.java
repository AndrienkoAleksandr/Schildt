package inner_class;

/**
 * Created by USER on 05.07.2014.
 */
public class Inner_class {
    public int i;
    public int j;

    private void method1() {
        System.out.println("method1()");
    }

    public void method2() {
        A a = new A();
        a.d = 0;
        a.g = 9;
        a.f();
        a.go();
        System.out.println("method1()");
    }

    private class A {
        public int g;
        private int d;

        private void s() {
            method1();
            method2();
        }

        public void f() {
            i = 9;
            j =8;
            System.out.println("f");
        }

        private void go() {
            System.out.println("go");
        }
    }

    private class C extends A {
        int k = 9;
    }
}
