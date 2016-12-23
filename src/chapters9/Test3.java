package chapters9;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @author by kissx on 2016/7/29.
 *         结论：[1]输出的结果利用构造器的初始化顺序可以解决
 *         [2]抽象方法可以有三种返回类型：public protected 默认
 */
public class Test3 {

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.print();
        sub.A();
        sub.B();
        sub.C();
    }
}

abstract class Base {
    abstract void print();

    public Base() {
        print();
    }

    abstract public void A();

    abstract protected void B();

    abstract void C();
}

class Sub extends Base {

    int i = 5;

    void print() {
        System.out.println("i = " + i);
    }

    public void A() {
        System.out.println("abstract:   public");
    }

    protected void B() {
        System.out.println("abstract:   protected");
    }

    void C() {
        System.out.println("abstract:   包内");
    }
}
