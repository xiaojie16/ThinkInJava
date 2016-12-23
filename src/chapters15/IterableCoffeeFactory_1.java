package chapters15;

import java.util.Iterator;

/**
 * @author by kissx on 2016/10/4.
 */
public class IterableCoffeeFactory_1 implements Iterable<Coffee> {
    //private CoffeeFactory coffeeFactory = new CoffeeFactory();    因为要调用的方法为静态的所以根本不要需要组合
    private int count;

    public IterableCoffeeFactory_1(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {

            private int size = count;

            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Coffee next() {
                size--;
                return CoffeeFactory.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Coffee c : new IterableCoffeeFactory_1(28)) {
            System.out.println(c);
        }
    }
}
