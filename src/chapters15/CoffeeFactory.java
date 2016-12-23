package chapters15;

import chapters15.util.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 注意与 CofferGenerator 的差别
 *
 * @author by kissx on 2016/10/4.
 */
public class CoffeeFactory {
    private static List<Generator<? extends Coffee>> list = new ArrayList<>();

    static {
        list.add(new Capppuccino.Factory());
        list.add(new Latte.Factory());
        list.add(new Mocha.Factory());
    }

    private static Random random = new Random(47);

    public static Coffee next() {
        return list.get(random.nextInt(list.size())).next();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            System.out.println(CoffeeFactory.next());
        }
    }

}
