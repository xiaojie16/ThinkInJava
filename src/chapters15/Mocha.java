package chapters15;

import chapters15.util.Generator;

/**
 * @author by kissx on 2016/10/4.
 */
public class Mocha extends Coffee {
    public static class Factory implements Generator<Mocha> {
        public Mocha next() {
            return new Mocha();
        }
    }
}
