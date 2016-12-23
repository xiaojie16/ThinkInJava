package chapters8;

/**
 * @author by kissx on 2016/7/29.
 *         结论：不能通过不同的返回值类型来覆盖，想重载一样，但是覆盖有协变返回类型
 */
public class TestLoad {

    public static void main(String[] args) {
        D d = new D();
        d.get();
        C c = new C();
        c.get();
    }
}

class A {
    public A() {
        System.out.println("A:  构造器；");
    }
    /*void f(){
        System.out.println("A:  f();");
    }*/
}

class B extends A {
    public B() {
        System.out.println("B:  构造器；");
    }
    /*int f(){
        System.out.println("B: f()");
        return 0;
    }*/
}

class C {
    A get() {
        return new A();
    }
}

class D extends C {
    B get() {
        return new B();
    }
}