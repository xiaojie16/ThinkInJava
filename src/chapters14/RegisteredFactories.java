package chapters14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author by kissx on 2016/9/22.
 */
public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Part.createRandom());
        }
    }
}

class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory implements chapters14.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class Belt extends Part {
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements chapters14.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}


