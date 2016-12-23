package chapters14;

/**
 * @author by kissx on 2016/9/26.
 */
public class InnerA {
    private static class C implements A {    //把C作为静态内部类
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

    public static A makeA() {
        return new C();
    }

    public static void main(String[] args) throws Exception {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}
