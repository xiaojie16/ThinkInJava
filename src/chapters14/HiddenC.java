package chapters14;

/**
 * 实现接口A 为了降低耦合度把类C作为包访问权限
 *
 * @author by kissx on 2016/9/26.
 */

class C implements A {

    @Override
    public void f() {
        System.out.println("pubic C.f()");
    }

    @Override
    public void g() {
        System.out.println("pubic C.g()");
    }

    void u() {
        System.out.println("package C.u()");
    }

    protected void v() {
        System.out.println("protected C.v()");
    }

    private void w() {
        System.out.println("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}
