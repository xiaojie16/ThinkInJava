package chapters15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by kissx on 2016/10/3.
 */
public class Test2<T> {
    //private T[] arr = new T[3]; //这个为什么不行，T[3]没被初始化？需要 T 类型的有默认的构造方法？？
    private List<T> list = new ArrayList<>(3);     //此处参数3只是最初的容量

    public Test2(T t1, T t2, T t3) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
    }

    public T getT1() {
        return list.get(0);
    }

    public T getT2() {
        return list.get(1);
    }

    public T getT3() {
        return list.get(2);
    }

    public static void main(String[] args) {
        Test2<String> test = new Test2<>("我是 1", "我是 2", "我是 3");
        System.out.println(test.getT1());
        System.out.println(test.getT2());
        System.out.println(test.getT3());
    }
}
