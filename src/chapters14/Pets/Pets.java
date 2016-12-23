package chapters14.Pets;

import java.util.ArrayList;

/**
 * @author by kissx on 2016/9/20.
 */
public class Pets {
    //*
    public static final PetCreator petCreator = new LiteralPetCreator();

    public static Pet randomPet() {
        return petCreator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return petCreator.createArray(size);
    }

    public static ArrayList<Pet> createList(int size) {
        return petCreator.arrayList(size);
    }
    //*/

}
