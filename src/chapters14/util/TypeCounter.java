package chapters14.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by kissx on 2016/9/20.
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object object) {
        Class<?> type = object.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException("参数错误！");
        } else {
            countType(type);
        }
    }

    private void countType(Class<?> object) {
        Integer p = get(object);
        put(object, p == null ? 1 : p + 1);
        Class superClass = object.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass))
            countType(superClass);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
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
