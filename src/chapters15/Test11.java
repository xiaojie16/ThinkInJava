package chapters15;

import java.math.BigInteger;

/**
 * @author by kissx on 2016/10/22.
 */
public class Test11 {

    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(1000);
        for (int i = 1; i <= 5; ++i) {
            System.out.println(bigInteger = bigInteger.nextProbablePrime());
        }
    }

}
