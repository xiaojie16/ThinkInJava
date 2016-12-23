package chapters14;

/**
 * @author by kissx on 2016/9/13.
 */

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class Name: " + cc.getName() + "is interface ? [" + cc.isInterface() + "]");
        System.out.println("Simple Name: " + cc.getSimpleName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapters14.FancyToy");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());
    }
}
