package chapters15;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个泛型类型之间的向上转型关系
 *
 * @author by kissx on 2016/10/17.
 */

class Father {
}

class Son extends Father {
}

class NewTest<T> {
    private T value;

    public NewTest(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Father> flist1 = new ArrayList<>();
        List<? extends Number> flist2 = new ArrayList<Integer>();   //这种的包含了向上转型，而该转型的代价是不能再向里面添加元素了，因为
        //泛型没有实现协变等，此时编译器并不清楚 flist2 中到底是哪种类型
        //另外的代价就是对于一些方法，如果其参数含有 通配符 则不允许调用，否则出错
        //List<? extends Father> flist1 = new ArrayList<>(? extends Father);    //该句话是错误的
        //flist1.add(new Father()); 这里理解错了，p330 页的意思那里的容器是包含泛型类的，对于每个泛型类利用了通配符
        //flist2.add(new Integer(0));
        //编译器将直接拒绝对参数列表中涉及通配符的方法
    }
}
