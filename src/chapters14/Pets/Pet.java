package chapters14.Pets;

import chapters14.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author by kissx on 2016/9/18.
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static List<Factory<? extends Pet>> list = new ArrayList<>();

    static {
        list.add(new Manx.Factory());
        list.add(new Mutt.Factory());
        list.add(new Gerbil.Factory());
    }

    private static Random rand = new Random(47);

    public static Pet createRandom() {
        int n = rand.nextInt(list.size());
        return list.get(n).create();
    }

    @Override
    public String toString() {
        return "Pet";
    }
}
