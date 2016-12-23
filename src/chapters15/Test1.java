package chapters15;

/**
 * @author by kissx on 2016/10/3.
 */
public class Test1<T> {
    private T t;

    public Test1(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Test1<Object> test = new Test1<>(obj);
        String str = "我也能放进去！";
        test.setT(str);
        System.out.println(test.getT());
    }
}
