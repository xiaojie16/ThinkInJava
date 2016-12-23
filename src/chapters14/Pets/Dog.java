package chapters14.Pets;

/**
 * @author by kissx on 2016/9/18.
 */
public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
