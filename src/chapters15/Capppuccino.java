package chapters15;

import chapters15.util.Generator;

/**
 * @author by kissx on 2016/10/4.
 */
public class Capppuccino extends Coffee {
    public static class Factory implements Generator<Capppuccino> {
        public Capppuccino next() {
            return new Capppuccino();
        }
    }
}
