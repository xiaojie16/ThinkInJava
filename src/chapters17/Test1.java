package chapters17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by kissx on 2016/10/27.
 */
public class Test1 {

    private static class MyClass1 {
        public static void printf1() {
            System.out.println("测试1！");
        }

        public void printf2() {
            System.out.println("测试2！");
        }
    }

    public static MyClass1 newPrintf() {
        return new MyClass1() {
            @Override
            public void printf2() {
                System.out.println("new 测试2！");
            }
        };
    }

    private static class MyClass2 extends MyClass1 {
        @Override
        public void printf2() {
            System.out.println("new 测试1！");
        }

        public static void printf1() {
            System.out.println("new 测试2！");
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P Q R S".split(" "));
        ArrayList<String> newList = new ArrayList<>(list);
        list.add("C");
    }

}
