package chapters15;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试泛型的 标志，这是在泛型类的定义出
 * 对于 什么标识 它无论是否有相应的 类T 它都为只是泛型的一个标志
 * 而在 继承 泛型类时，在“被继承者”的泛型参数列表中必须是已有的或者在“继承者”的泛型参数列表中已经存在的
 *
 * @author by kissx on 2016/10/15.
 */

class T {
    public T() {
        System.out.println("我不是泛型的！！");
    }
}

class X {
    public X() {
        System.out.println("我是X，我不是泛型标志！");
    }
}

class MyList<X> {
    List<X> list = new ArrayList<>();
}

class MyNewList1 extends MyList<X> {
    //这里假如我把上面的 X 类注释了，就会出现错误
}

class MyNewList2<X> extends MyList<X> {
    //这里即使我把上面的 X 类注释了，也不会出现错误
}

public class Test3 {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        MyList<T> myList_t = new MyList<>();
    }
}
