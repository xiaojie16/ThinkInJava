package chapters15;

/**
 * 延伸关于类数组
 *
 * @author by kissx on 2016/10/3.
 */
public class Test2_2 {

    private A[] array_a = new A[3];     //这里也可以，并且存储的为 null
    private B[] array_b = new B[3];

    public A[] getArray_a() {
        return array_a;
    }

    public B[] getArray_b() {
        return array_b;
    }

    public static void main(String[] args) {
        /*
        A[] arr_a = new A[3];   //这里可以呀，为什么在泛型类中就不可以了！！！（注意：这是在方法中！）
        B[] arr_b = new B[3];   //这里的在数组中的都为空！！！
        for (A a : arr_a) {
            System.out.println(a);
        }
        for (B b : arr_b) {
            System.out.println(b);
        }
        //*/

        Test2_2 test = new Test2_2();
        A[] array_a = test.getArray_a();
        B[] array_b = test.getArray_b();

        for (A a : array_a) {
            System.out.println(a);
        }
        for (B b : array_b) {
            System.out.println(b);
        }
    }

}

class A {
    public A(String str) {
        System.out.println(str + " :我必须需要参数（你）！");
    }
}

class B {
    public B() {
        System.out.println("B: 无参构造方法！");
    }

    public B(String str) {
        System.out.println("B: 有参构造方法！");
    }
}
