package chapters15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author by kissx on 2016/10/20.
 */
public class CheckedList {

    public static void main(String[] args) {
        List<Pet> list1 = new ArrayList<>();
        List list2 = new ArrayList<Dog>();
        List<Dog> list3 = Collections.checkedList(new ArrayList<>(), Dog.class);
        List list4 = list3;
        list2.add(new Cat());
//        list3.add(new Cat());
//        这个错误在编译的时候就可以给出了
//        list4.add(new Cat());
//        这个错误在运行时给出了，这样就可以很方便的向容器里面添加元素了，而且能保证安全性。不能使用类型标签了

    }

}

class Pet {
}

class Dog extends Pet {
}

class Cat extends Pet {
}
