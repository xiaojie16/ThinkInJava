package chapters8;

/**
 * @author by kissx on 2016/7/26.
 *         误区：切记new一次调用一次构造函数
 */
public class TestConstruction {
    public static void main(String[] args) {
        new Lunch();
    }
}

class Meal {

    private Bread bread = new Bread();

    public Meal() {
        System.out.println("Meal:   Created");
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread:   Created");
    }
}

class Lunch extends Meal {

    //Meal 既被继承又被组合
    private Meal meal = new Meal();
    private Bread bread = new Bread();

    public Lunch() {
        System.out.println("Lunch:   Created");
    }
}
