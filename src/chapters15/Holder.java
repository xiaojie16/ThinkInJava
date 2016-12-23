package chapters15;

/**
 * @author by kissx on 2016/10/3.
 */
public class Holder<T> {
    private T t;    //这里的泛型类，可以看做多了一个被参数化的类型变量；是不是都是这样呢？？

    public Holder(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public boolean equals(Object obj) {
        return t.equals(obj);
    }

    public static void main(String[] args) {
        /*
        String str = "测试！";
        Holder<String> holder = new Holder<>(str);
        String t = holder.getT();
        System.out.println(t);
        //*/

        Holder<Integer> holder = new Holder<>(0);
        Integer i = holder.getT();
        holder.setT(1);
        Holder<? extends Number> myHolder = new Holder<Integer>(0);
        Integer n = (Integer) myHolder.getT();
        System.out.println("测试 n = " + n);
//        myHolder.setT(new Integer(1));
        try {
            Short t = (Short) myHolder.getT();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束！！！");
    }
}
