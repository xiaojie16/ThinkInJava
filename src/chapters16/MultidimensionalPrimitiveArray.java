package chapters16;

import java.util.Arrays;

/**
 * @author by kissx on 2016/10/22.
 */
public class MultidimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        String s = Arrays.deepToString(a);


        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.toString(a));


    }

}
