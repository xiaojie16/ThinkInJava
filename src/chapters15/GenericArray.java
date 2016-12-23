package chapters15;

/**
 * @author by kissx on 2016/10/15.
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<>(6);
        genericArray.put(0, 1);
        int i = genericArray.get(0);
        Object[] arr = genericArray.rep();
//        Integer[] arr = genericArray.rep();
//        不能直接将一个数组强制转为其子类型的数组
        System.out.println(arr[0]);
    }

}
