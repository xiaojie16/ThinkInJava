package chapters14.Pets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author by kissx on 2016/9/20.
 */
public class PetCount3 {
    private static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        private static Map<Class<? extends Pet>, Integer> map = new HashMap<>();

        static {
            for (Class<? extends Pet> petClass : LiteralPetCreator.allTypes) {
                map.put(petClass, 0);
            }
        }

        public PetCounter() {
            super(map);
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(15)) {
            System.out.print(pet.getClass().getSimpleName() + "　");
            petCount.count(pet);
        }
        System.out.println();
        System.out.println(petCount);
    }
}
