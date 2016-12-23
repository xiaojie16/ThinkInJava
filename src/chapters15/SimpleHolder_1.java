package chapters15;

/**
 * 该案例为测试 此泛型类与 SimpleHolder 会有相同的字节码，所以泛型的动作发生在边界处
 *
 * @author by kissx on 2016/10/15.
 */
public class SimpleHolder_1<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        SimpleHolder_1<String> simpleHolder = new SimpleHolder_1<>();
        simpleHolder.setT("item");
        String t = simpleHolder.getT();
        //此处就不需要转型了，因为编译器会自动加上
    }
}
