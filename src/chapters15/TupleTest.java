package chapters15;

import chapters15.util.ThreeTuple;
import chapters15.util.Tuple;
import chapters15.util.TwoTuple;

/**
 * @author by kissx on 2016/10/6.
 */
public class TupleTest {
    static TwoTuple<Integer, String> testTwoTuple() {
        return Tuple.tuple(5, "测试");
    }

    static ThreeTuple<Double, Integer, String> testThreeTuple() {
        return Tuple.tuple(1.0, 6, "测试3");
    }

    static TwoTuple testTwoTuple_lack() {
        return Tuple.tuple(7, "测试");
    }

    public static void main(String[] args) {
        System.out.println(testTwoTuple());
        System.out.println(testThreeTuple());
        System.out.println(testTwoTuple_lack());
        TwoTuple<Integer, String> twoTuple = testTwoTuple_lack();    //先将参数化对象向上转型为非参数对象，然后再转回去
        //注意转回去的过程会发出警告
        System.out.println(twoTuple);
    }
}
