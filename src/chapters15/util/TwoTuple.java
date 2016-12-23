package chapters15.util;

/**
 * @author by kissx on 2016/10/3.
 */
public class TwoTuple<A, B> {
    public final A a;   //a 一定会被初始化，且不会被更改
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
