package chapters15;

import java.util.Iterator;

/**
 * 这个是 适配器
 *
 * @author by kissx on 2016/10/4.
 */
public class IterableCoffeeFactory extends CoffeeFactory implements Iterable<Coffee> {

    private int count;

    public IterableCoffeeFactory(int count) {
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

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Coffee c : new IterableCoffeeFactory(18)) {
            System.out.println(c);
        }
    }

}
