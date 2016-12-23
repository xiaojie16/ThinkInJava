package chapters15.util;

/**
 * 通用的 Generator
 *
 * @author by kissx on 2016/10/6.
 */
public class BasicGenerator<T> implements Generator {

    private T t;
    private Class<T> tClass;

    public BasicGenerator(Class<T> tClass) {
        this.tClass = tClass;
    }

    @Override
    public T next() {
        try {
            t = tClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return t;
    }

    @SuppressWarnings("unchecked")  //用以关闭警告
    public static void main(String[] args) {
        BasicGenerator<String> gen = new BasicGenerator(String.class);
        String str = gen.next();
        System.out.println(str.getClass().getName());
    }

}
