package chapters17;

/**
 * 容器
 *
 * @author by kissx on 2016/11/20.
 */
public class TestParam {
    public final int size;
    public final int loops;

    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    public static TestParam[] array(int... values) {
        int length = values.length / 2;
        TestParam[] testParams = new TestParam[length];
        for (int i = 0; i < length; ++i) {
            testParams[i] = new TestParam(values[i * 2], values[i * 2 + 1]);
        }
        return testParams;
    }

    public static TestParam[] array(String[] values) {
        int[] vals = new int[values.length];
        for (int i = 0; i < vals.length; ++i) {
//            vals[i] = Integer.parseInt(values[i]);
            Integer decode = Integer.decode(values[i]);     //decode 与 parseInt
        }
        return array(vals);
    }


}
