package chapters17;

import java.util.Comparator;

/**
 * 比较 Comparable 和 Comparator
 *
 * @author by kissx on 2016/10/27.
 */
public class Test3 {

    /*
    Comparator<>
    int compare(T o1, T o2);
    boolean equals(Object obj);
    //*/

    /*
    Comparable<>
    public int compareTo(T o);
    //*/

    public static void main(String[] args) {
        C c1 = new C(4);
        C c2 = new C(4);
//        System.out.println(c1.equals(c2));
        System.out.println(c1.compareTo(c2));

        Object obj = new Object();
        obj.equals("");
        obj.hashCode();
    }
}

/**
 * 而Comparable 是在自己内部实现的
 */
class C implements Comparable<C> {
    private int value;

    public C(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(C c) {
        return value == c.getValue() ? 0 : (value > c.getValue()) ? 1 : -1;
    }

    /**
     * CC 是外部的专门用来比较 C 的类
     */

    class CC implements Comparator<C> {
        @Override
        public int compare(C o1, C o2) {
            return o1.compareTo(o2);
        }
    }
}
