package chapters15;

/**
 * 利用显示的工厂来实现泛型类中泛型参数的实例化
 *
 * @author by kissx on 2016/10/15.
 */
interface FactoryI<T> {
    T create();
}

class Foo<T> {
    private T t;

    public <F extends FactoryI<T>> Foo(F factory) {
        t = factory.create();
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

//注意这两种实现工厂方式的区别
class MyInteger implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return 0;
    }
}

class MyString {
    public static class Factory implements FactoryI<MyString> {
        @Override
        public MyString create() {
            return new MyString();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        Foo<Integer> foo1 = new Foo<>(new MyInteger());
        Foo<MyString> foo2 = new Foo<>(new MyString.Factory());
    }
}
