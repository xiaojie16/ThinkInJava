package chapters14.Pets;

import java.util.HashMap;

/**
 * @author by kissx on 2016/9/18.
 */
public class PetCount {
    private static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer num = get(type);
            if (num == null) {
                put(type, 1);
            } else {
                put(type, num + 1);
            }
        }
    }

    public static void countPets(PetCreator petCreator) {
        PetCounter counter = new PetCounter();
        //Pet[] array = petCreator.createArray(10);
        //*
        for (Pet pet : petCreator.createArray(15)) {
            if (pet instanceof Cat) {
                counter.count("Cat");
                //counter.count(pet.toString());    该语句是错误的，可以通过下面的注释掉的语句来解释
                //System.out.println(pet.toString());
            }
            if (pet instanceof Dog) {
                counter.count("Dog");
                //System.out.println(pet.toString());
            }
            if (pet instanceof Manx) {
                counter.count("Manx");
                //System.out.println(pet.toString());
            }
            if (pet instanceof Mutt) {
                counter.count("Mutt");
                //System.out.println(pet.toString());
            }
            if (pet instanceof Gerbil) {
                counter.count("GA");
            }
            if (pet instanceof Pet) {
                counter.count("Pet");
                //System.out.println(pet.toString());
            }
        }
        System.out.println(counter);
        //*/
        //for(int i = 0;i < array.length;++i)
        //    System.out.println(array[i]);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
