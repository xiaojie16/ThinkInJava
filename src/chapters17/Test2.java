package chapters17;

/**
 * @author by kissx on 2016/10/27.
 */
public class Test2 {

    public static void main(String[] args) {
        B b = new B();
        A a = new B();
        B.printf();
        A.printf();
    }


}

class A {
    public static void printf() {
        System.out.println("我是 A !");
    }
}

class B extends A {
    //    这不能成为继承，只是其又实现了 静态方法 printf ，而父类的被引产过程隐藏了
    public static void printf() {
        System.out.println("我是 B !");
    }
}
