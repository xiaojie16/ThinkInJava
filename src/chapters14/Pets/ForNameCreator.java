package chapters14.Pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by kissx on 2016/9/18.
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> result = new ArrayList<>();
    private static String[] classNames = {
            "chapters14.Pets.Manx",
            "chapters14.Pets.Mutt",
            "chapters14.Pets.Gerbil"
    };

    @SuppressWarnings("unchecked")
    //告诉编译器对被批注的代码元素内部的某些警告保持静默，unchecked指的是这里的强制转换
    //注意 @SuppressWarnings 不允许直接置于静态初始化语句之上，所以这里添加了一个方法
    private static void loader() {
        for (String className : classNames) {
            try {
                Class<?> pet = Class.forName(className);
                result.add((Class<? extends Pet>) pet);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return result;
    }
}
