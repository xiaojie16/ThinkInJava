package chapters15;

import java.util.HashMap;
import java.util.Map;

/**
 * 被用来进行类型参数推测
 *
 * @author by kissx on 2016/10/4.
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }
}
