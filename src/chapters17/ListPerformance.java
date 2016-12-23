package chapters17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author by kissx on 2016/11/21.
 */
public class ListPerformance {

    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<Integer>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<List<Integer>>("get") {
            @Override
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for (int i = 0; i < loops; ++i)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester<List<Integer>> listTest = new Tester<List<Integer>>(null, tests) {
            @Override
            protected List<Integer> initialize(int size) {
                Integer[] ia = {1, 2, 3, 4, 5, 6};
                return Arrays.asList(ia);
            }
        };
        listTest.timedTest();
    }

}
