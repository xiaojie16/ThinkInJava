package chapters12;

/**
 * @author by kissx on 2016/8/24.
 */
public class Test2 {
    public static void main(String[] args) {
        D d = new D();
        d.myPrint();
    }
}

class C {
    public void print() {
        System.out.println("我是：C");
    }
}

class D extends C {
    public void myPrint() {
        System.out.println("我是: D");
        print();
    }
}
