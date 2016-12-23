package chapters14.Pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author by kissx on 2016/9/20.
 */
public class LiteralPetCreator extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(Pet.class,
            Dog.class, Cat.class, Manx.class, Mutt.class, Gerbil.class));

    //List对象的subList(start,end) 具有截取的功能
    public static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Manx.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
