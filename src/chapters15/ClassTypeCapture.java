package chapters15;

import java.util.HashMap;
import java.util.Map;

/**
 * 类型标签
 * 注意此处的 map 提供了一种新思路，以后注意考虑作用
 *
 * @author by kissx on 2016/10/15.
 */
class Build {
}

class School extends Build {
}

public class ClassTypeCapture<T> {

    private static Map<String, Class<?>> map = new HashMap<>();

    private Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
        System.out.println(kind.getSimpleName());   //注意在 kind 仍然保留了类的详细信息
    }

    public boolean f(Object obj) {
        return kind.isInstance(obj);    //obj 是否为该类型(或子类型)的一种实例
    }

    /**
     * 向 hashMap 中添加 新的类型名以及该类型对应的 class
     */
    public void addType(String typeName, Class<?> kind) {
        map.put(typeName, kind);
    }

    /**
     *
     */
    public void createNew(String typeName) {
        try {
            Class kind = Class.forName(typeName);
            addType(typeName, kind);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClassTypeCapture<Build> classTypeCapture1 = new ClassTypeCapture<>(Build.class);
        ClassTypeCapture<School> classTypeCapture2 = new ClassTypeCapture<>(School.class);
        Build build = new Build();
        School school = new School();
        System.out.println(classTypeCapture1.f(build));     //true
        System.out.println(classTypeCapture1.f(school));    //true
        System.out.println(classTypeCapture2.f(build));     //false
        System.out.println(classTypeCapture2.f(school));    //true
    }
}
