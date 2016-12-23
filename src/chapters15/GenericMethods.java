package chapters15;

/**
 * @author by kissx on 2016/10/4.
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f("测试！");
        gm.f(1.0);
        gm.f(1);
        gm.f('c');
    }

}
