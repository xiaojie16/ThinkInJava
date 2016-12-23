package chapters15.util;

/**
 * 三元组
 * 提供多个对象的返回
 *
 * @author by kissx on 2016/10/3.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {   //这里的继承写成TwoTuple<A,B>比TwoTuple好，具体写成后面的一种有什么影响，暂时不明

    private C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }

    public static void main(String[] args) {
        ThreeTuple<Integer, String, Double> threeTuple = new ThreeTuple<>(1, "测试!", 1.);
        System.out.println(threeTuple);
    }
}
