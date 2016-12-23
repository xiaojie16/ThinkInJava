package chapters15;

import java.util.ArrayList;
import java.util.List;

/**
 * P[399]
 * 该测试并且讨论了关于 如何向 List<?> 中添加元素
 * 收获满满！！！
 *
 * @author by kissx on 2016/10/18.
 */
public class Test_29 {

    private static <T> void test1(Holder<List<?>> myHolder, Class<?> kind, T myT) throws Exception {
        List<?> t = myHolder.getT();
        myHolder.setT(new ArrayList<>());
//        Object o = t.get(0);
//      里面还没有东西所以不能取

//        t.set(1,new Object());
//        不能通过向 list 中添加元素

//        List<? super Object> newList = t;
//        超类型通配符很傲娇，动不动就不接受

        List objList = t;
        objList.add(444);
//        这里虽然可以加进去了但是类型别玩坏了（错了），而且没有保存，不安全！！！
        objList.add("我是测试！");
        System.out.println(t.get(0));
        System.out.println(t.get(1));

        List<String> strList = (List<String>) t;
        strList.add("这就安全了吗？");
        System.out.println(t.get(2));
        System.out.println(strList.get(2));
//        System.out.println(strList.get(0));
//        在利用 strList 取出元素的时候有检查看，并且放入元素的时候也可以检查相对上面的是安全了，但是
//        在实际利用的时候并不知道，确切的类型，要不就不能利用 List<?> 做参数了

//        新的解决方案是利用类型标签？    还是很管用的
        objList.add(kind.newInstance());
        if (kind.isInstance(myT))
            objList.add(myT);
        System.out.println(t.get(3));
//        System.out.println(t.get(4));

//        另一种解决方法，很显然不可以
        List<T> tList = (List<T>) t;
        tList.add(myT);
        System.out.println(t.get(4));


    }

    private static void test2(List<Holder<?>> myList) {
        myList.add(new Holder<>("测试"));
        Holder<?> holder = myList.get(0);

//        holder.setT(111);
//        向这里添加就有问题了！！！
//        解决方案同上
        Holder newHolder = holder;
        newHolder.setT("我就是能随便改！");
//        这里最好添加类型标签

        Object t = holder.getT();
        System.out.println(t);
    }

    public static void main(String[] args) throws Exception {
        Holder<List<?>> myHolder = new Holder<>(new ArrayList<String>());
        test1(myHolder, String.class, "我还是测试");
//        test1(myHolder,String.class,123);
        test1(myHolder, String.class, 1234);
        System.out.println("--------------我是华丽的分割线-------------");
        List<Holder<?>> myList = new ArrayList<>();
        test2(myList);
    }

}
