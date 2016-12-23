package chapters15;

/**
 * @author by kissx on 2016/10/3.
 */
public class Test2_1<T> {
    private T t1;
    private T t2;
    private T t3;

    public Test2_1(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }

    public T getT3() {
        return t3;
    }

    public static void main(String[] args) {
        Test2_1<String> test = new Test2_1<>("我是1", "我是2", "我是3");
        System.out.println(test.getT1());
        System.out.println(test.getT2());
        System.out.println(test.getT3());
    }
}
