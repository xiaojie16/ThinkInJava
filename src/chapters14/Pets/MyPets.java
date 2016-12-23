package chapters14.Pets;

import java.util.ArrayList;

/**
 * @author by kissx on 2016/9/22.
 */
public class MyPets {
    public static final MyPetCreator petCreator = new MyPetCreator();

    public static Pet randomPet() {
        return petCreator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return petCreator.createArray(size);
    }

    public static ArrayList<Pet> createList(int size) {
        return petCreator.arrayList(size);
    }
}
