package chapters15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author by kissx on 2016/10/3.
 */
public class RandomList<T> {

    private List<T> list = new ArrayList<>();
    private Random random = new Random(47);

    public void add(T item) {
        list.add(item);
    }

    public T select() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : "我 只是 测试".split(" "))
            rs.add(s);
        for (int i = 0; i < 5; ++i) {
            System.out.println(rs.select());
        }
    }
}
