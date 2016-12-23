package chapters15;

/**
 * @author by kissx on 2016/10/15.
 */

class GenericBase<T> {
    T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class Derived1 extends GenericBase {
    //这样是可以的
}

class Derived2<T> extends GenericBase<T> {
    //注意这里 derived<T> 必须要加 T ，否则其父类即 GenericBase 无法确定 T
}

class Derived3<T> extends GenericBase {
    //注意这里像是规定了对于父类必须指定确切的泛型类型（注意此词的理解），否则就是用原生基类（不带泛型的）
}


public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derived3 derived3 = new Derived3();
    }
}
