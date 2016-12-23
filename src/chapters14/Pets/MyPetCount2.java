package chapters14.Pets;

import chapters14.util.TypeCounter;

/**
 * @author by kissx on 2016/9/22.
 */
public class MyPetCount2 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : MyPets.createArray(15)) {
            System.out.print(pet.getClass().getSimpleName() + "　");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
