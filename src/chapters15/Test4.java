package chapters15;

/**
 * @author by kissx on 2016/10/15.
 */
public class Test4 {

    public static void main(String[] args) {
        Object[] objs = new String[5];
        objs[0] = new String("测试"); //协变类型
        //objs[1] = new Object();
        System.out.println(objs[0]);
        //System.out.println(objs[1]);
        /*
        Object[] arr = {"0","1","2"};
        String[] str_arr = (String[]) arr;
        System.out.println(str_arr[0]);
        //*/
        /**
         * 被注释的两句可以证明是协变类型而不是向上转型
         */
    }

}
