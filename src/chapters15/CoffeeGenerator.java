package chapters15;

import chapters15.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * 注意与 CoffeeFactory 的差别
 *
 * @author by kissx on 2016/10/4.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private int size;
    private Class[] types = {Capppuccino.class, Latte.class, Mocha.class};
    Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {

            private int count = size;

            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Coffee next() {
                size--;
                return CoffeeGenerator.this.next();     //注意此处
            }
        };
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; ++i)
            System.out.println(gen.next());
        for (Coffee coffee : new CoffeeGenerator(5))
            System.out.println(coffee);
    }
}
