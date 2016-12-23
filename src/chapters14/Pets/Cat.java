package chapters14.Pets;

/**
 * @author by kissx on 2016/9/18.
 */
public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
