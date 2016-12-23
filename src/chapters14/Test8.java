package chapters14;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author by kissx on 2016/9/13.
 */
public class Test8 {
    public static void main(String[] args) throws Exception {
        getExtend(new Integer(1).getClass());
        Field[] declaredFields = new ArrayList<>().getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
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
