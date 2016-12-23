package chapters15;

import chapters15.util.Generator;

/**
 * @author by kissx on 2016/10/4.
 */
public class Latte extends Coffee {

    public static class Factory implements Generator<Latte> {

        @Override
        public Latte next() {
            return new Latte();
        }
    }

}
