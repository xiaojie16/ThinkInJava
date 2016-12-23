package chapters14.Pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author by kissx on 2016/9/18.
 */
public abstract class PetCreator {
    private Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet() {
        Class<? extends Pet> petClass = types().get(rand.nextInt(types().size()));
        try {
            return petClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);  //在这里不知道如何处理该异常，所以就通过不必捡把它一层一层往上抛，直到结束
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; ++i) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> list = new ArrayList<>();
        /*
        for(int i = 0;i < size;++i){
            list.add(randomPet());
        }//*/
        Collections.addAll(list, createArray(size));
        //利用Collection类来填充 list
        return list;
    }
}
