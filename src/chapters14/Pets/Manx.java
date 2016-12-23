package chapters14.Pets;

import chapters14.Factory;

/**
 * @author by kissx on 2016/9/18.
 */
public class Manx extends Cat {
    public Manx(String name) {
        super(name);
    }

    public Manx() {
        super();
    }

    public static class Factory implements chapters14.Factory<Manx> {
        @Override
        public Manx create() {
            return new Manx();
        }
    }

    @Override
    public String toString() {
        return "Manx";
    }
}
