package chapters14;

/**
 * @author by kissx on 2016/9/16.
 */
class Initable {
    private int a;
    static int staticNonFinal = 74;

    {
        System.out.println("我是实力初始化子句！");
    }

    static {
        System.out.println("Initializing Initable");
    }

    public Initable() {
        System.out.println("Initable 的构造方法！");
    }
}

public class MyTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("chapters14.Initable");
    }
}
