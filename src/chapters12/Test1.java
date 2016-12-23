package chapters12;

/**
 * @author by kissx on 2016/8/6.
 */
public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        try {
            b.init();
        } catch (Eb eb) {
            eb.printStackTrace(System.out);
        }
        A a = new B();
        try {
            a.init();
        } catch (Ea ea) {
            ea.printStackTrace();
        }
    }
}

class Ea extends Exception {
}

class Eb extends Ea {
}

class Ec extends Exception {
}

class A {
    public void init() throws Ea {
        System.out.println("A:  init();");
        throw new Ea();
    }
}

class B extends A {
    public void init() throws Eb {
        System.out.println("B:  init();");
        throw new Eb();
    }
}
