package chapters15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by kissx on 2016/10/4.
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        //略
    }
}
