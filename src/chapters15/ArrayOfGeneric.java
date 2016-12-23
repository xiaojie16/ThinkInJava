package chapters15;

/**
 * @author by kissx on 2016/10/16.
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        gia = new Generic[SIZE];
        gia[0] = new Generic<Integer>();
        //gia[1] = new Generic<Double>();   //出现错误！
        //gia[2] =  new Object();   //出现错误！
        System.out.println(gia.getClass().getSimpleName());
        Generic[] gia_1 = new Generic[SIZE];
        gia_1[0] = new Generic<Integer>();
        gia_1[1] = new Generic<Double>();
        System.out.println(gia_1.getClass().getSimpleName());
        System.out.println(gia_1[0].getClass().getSimpleName());
        System.out.println(gia_1[1].getClass().getSimpleName());

    }
}