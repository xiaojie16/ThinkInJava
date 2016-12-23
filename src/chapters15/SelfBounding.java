package chapters15;

/**
 * 测试自限定
 *
 * @author by kissx on 2016/10/18.
 */
class SelfBounded<T extends SelfBounded<T>> {
    T element;

    SelfBounded<T> set(T arg) {
        element = arg;
        return this;
    }

    T get() {
        return element;
    }
}

class MyBounded<T extends MyBounded> {
    T element;

    MyBounded<T> set(T arg) {
        element = arg;
        return this;
    }

    T get() {
        return element;
    }
}

class G extends MyBounded<G> {
}

class I extends MyBounded {
}

class H extends MyBounded<I> {
}  //这个可以


class E extends SelfBounded<E> {
}

class F extends SelfBounded<E> {
}    //自限定限制只能强制作用于继承关系。
//如果想要使用只限制，就应该了解这个类所用的类型参数将与使用这个参数的类具有相同的基类型
//这同样适用于泛型参数
//class G extends SelfBounded<Z>{}

class J extends SelfBounded {
}
//class K extends SelfBounded<J>{}     //这个不可以，两者的区别


public class SelfBounding {
    public static void main(String[] args) {
        E e = new E();
        SelfBounded<E> set = e.set(e);
        F f = new F();
//        f.set(e);
//        注意这里只能是 e 不能是 f
    }
}
