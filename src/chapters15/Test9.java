package chapters15;

/**
 * @author by kissx on 2016/10/4.
 */
public class Test9 {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Test9 test = new Test9();
        test.f(1, 1.0, 2);
        test.f("测试", 1, 'c');
    }
}
