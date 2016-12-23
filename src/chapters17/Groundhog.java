package chapters17;

/**
 * @author by kissx on 2016/11/16.
 */
public class Groundhog {
    protected int number;

    public Groundhog(int n) {
        number = n;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog && ((Groundhog) obj).number == number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
