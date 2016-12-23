package chapters15;

/**
 * @author by kissx on 2016/10/4.
 */
public class Test10 {

    public <A, B> void f(A a, String str, B b) {
        System.out.println(a.getClass().getName());
        System.out.println(str);
        System.out.println(b.getClass().getName());
    }

    public static void main(String[] args) {
        Test10 test = new Test10();
        test.f(1, "test", 'c');
    }

}
