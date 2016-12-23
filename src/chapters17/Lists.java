package chapters17;

import java.util.*;

/**
 * @author by kissx on 2016/10/27.
 */
public class Lists {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A B C D E F G H I J K L M N O P Q R S".split(" ")));
        int a = list.indexOf("A");
        System.out.println("A 的位置为： " + a);

        /**
         * listIterator 与 Iterator 两者的区别
         */
//        ListIterator<String> stringListIterator = list.listIterator();
//        while (stringListIterator.hasNext()){
//            System.out.println(stringListIterator.next());
//        }
        /**
         * Returns a list iterator over the elements in this list (in proper
         * sequence).
         *
         * @return a list iterator over the elements in this list (in proper
         *         sequence)
         */
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        /**
         * Returns an iterator over the elements in this list in proper sequence.
         *
         * @return an iterator over the elements in this list in proper sequence
         */

        /*Iterator与ListIterator区别如下：
        1、Iterator是ListIterator的父接口。
        2、Iterator是单列集合(Collection)公共取出容器中元素的方式。
        对于List，Set都通用。
        而ListIterator是List集合的特有取出元素方式。
        3、Iterator中具备的功能只有hashNext(),next()，remove();
        ListIterator中具备着对被遍历的元素进行增删改查的方法，可以对元素进行逆向遍历。
        之所以如此，是因为 ListIterator 遍历的元素所在的容器都有索引。*/

//        stringListIterator.add("11");
//        System.out.println(stringListIterator.next());

        /*
        System.out.println("--------------------我是华丽的分割线--------------------");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("--------------------我是华丽的分割线--------------------");
        ListIterator<String> newListIterator = list.listIterator();
        System.out.println(newListIterator.next());
        newListIterator.add("22");
        while (newListIterator.hasNext()){
            System.out.println(newListIterator.next());
        }
        //*/
        /*
        System.out.println("--------------------我是华丽的分割线--------------------");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("--------------------我是华丽的分割线--------------------");
        ListIterator<String> stringListIterator = list.listIterator();
//        System.out.println(stringListIterator.next());
        stringListIterator.remove();
        System.out.println(stringListIterator.next());
        //*/
        System.out.println("--------------------我是华丽的分割线--------------------");
        for (String str : list) {
            System.out.println(str);
        }

        ListIterator<String> stringListIterator = list.listIterator();
//        stringListIterator.add("11");

//        System.out.println("--------------------我是华丽的分割线--------------------");
//        for (String str : list) {
//            System.out.println(str);
//        }

        stringListIterator.next();
        stringListIterator.set("11");

        System.out.println("--------------------我是华丽的分割线--------------------");
        for (String str : list) {
            System.out.println(str);
        }

    }
}
