package chapters15;

/**
 * @author by kissx on 2016/10/4.
 */
public class Coffee {

    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
