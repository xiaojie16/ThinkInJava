package chapters15;

import java.util.Map;

/**
 * @author by kissx on 2016/10/4.
 */
public class LimitsOfInference {

    static void f(Map<Integer, String> map) {
        System.out.println(map.getClass().getName());
    }

    public static void main(String[] args) {
        f(New.map());   //此处也可以在 java 8 中
        f(New.map());   //泛型方法的显示类型说明
    }

}
