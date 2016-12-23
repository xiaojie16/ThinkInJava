package chapters14.Pets;

import chapters14.Factory;

/**
 * @author by kissx on 2016/9/18.
 */
public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }

    public static class Factory implements chapters14.Factory<Mutt> {
        @Override
        public Mutt create() {
            return new Mutt();
        }
    }

    @Override
    public String toString() {
        return "Mutt";
    }
}
