package chapters15;

/**
 * @author by kissx on 2016/10/18.
 */
public class BasicHolder<T> {
    T element;

    void set(T t) {
        element = t;
    }

    T get() {
        return element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
