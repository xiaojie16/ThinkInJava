package chapters15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author by kissx on 2016/10/15.
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    public T[] create(int size, T t) {        //通过边界处的动作最终可以保证 T[] 正常使用
        T[] t_array = (T[]) Array.newInstance(kind, size);
        Arrays.fill(t_array, t);
        return t_array;
    }

    public static void main(String[] args) {
        Class<String> kind = String.class;
        ArrayMaker<String> arrayMaker = new ArrayMaker<>(kind);
        String[] strings = arrayMaker.create(5, "Hello");
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
