package chapters14;

import java.lang.reflect.Method;

/**
 * 通过此类可以反映出反射的强大
 *
 * @author by kissx on 2016/9/26.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");

    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);  //设置为可访问
        g.invoke(a);
    }
}
