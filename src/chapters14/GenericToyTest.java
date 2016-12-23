package chapters14;

/**
 * @author by kissx on 2016/9/16.
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //Class<Toy> up = ftClass.getSuperclass();      //注意该句的错误
        Object obj = up.newInstance();
    }
}
