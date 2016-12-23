package chapters17;

/**
 * @author by kissx on 2016/11/20.
 */
public abstract class Test<C> {

    String name;
    C c;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam tp);
}
