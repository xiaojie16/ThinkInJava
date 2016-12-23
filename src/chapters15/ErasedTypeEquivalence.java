package chapters15;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author by kissx on 2016/10/13.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1 == c2);
        System.out.println(Arrays.toString(c1.getTypeParameters()));
    }
}
