package chapters14.Pets;

import chapters14.util.TypeCounter;

/**
 * @author by kissx on 2016/9/20.
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(15)) {
            System.out.print(pet.getClass().getSimpleName() + "　");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
