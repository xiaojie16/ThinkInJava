package chapters14.Pets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author by kissx on 2016/9/22.
 */
public class MyPetCreator {
    public Pet randomPet() {
        return Pet.createRandom();
    }

    public Pet[] createArray(int size) {
        Pet[] pets = new Pet[size];
        for (int i = 0; i < size; ++i) {
            pets[i] = Pet.createRandom();
        }
        return pets;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> list = new ArrayList<>();
        Collections.addAll(list, createArray(size));
        return list;
    }
}
