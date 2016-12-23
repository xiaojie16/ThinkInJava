package chapters13;

/**
 * @author by kissx on 2016/9/1.
 */
public class InfiniteRecursion {
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + '\n';
    }

    public static void main(String[] args) {
        InfiniteRecursion obj = new InfiniteRecursion();
        System.out.println(obj);
    }
}
