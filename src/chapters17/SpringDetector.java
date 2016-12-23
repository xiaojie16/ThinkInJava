package chapters17;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author by kissx on 2016/11/16.
 */
public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; ++i) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        System.out.println(map);
        Groundhog gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(gh);
        } else {
            System.out.println("Key not found: " + gh);
        }

        Set<Map.Entry<Groundhog, Prediction>> entries = map.entrySet();
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }

}
