package chapters14;

/**
 * @author by kissx on 2016/9/13.
 */
public class Test9 {
    public static void main(String[] args) throws Exception {
        getExtend(new Integer(1).getClass());
    }

    public static void getExtend(Class cc) throws Exception {
        if (cc.isInstance(new Object()))
            System.out.println("Class Object");
        else {
            System.out.println(cc);
            getExtend(cc.getSuperclass());
        }
    }
}
