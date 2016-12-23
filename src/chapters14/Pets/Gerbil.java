package chapters14.Pets;

import chapters14.Factory;

/**
 * @author by kissx on 2016/9/22.
 */
public class Gerbil extends Pet {
    public Gerbil(String name) {
        super(name);
    }

    public Gerbil() {
        super();
    }

    public static class Factory implements chapters14.Factory<Gerbil> {
        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}
