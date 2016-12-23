package chapters12;

/**
 * @author by kissx on 2016/8/11.
 */
public class Test4 {
    public static void main(String[] args) {
        int i = 5;
        int j = i++ + i++;
        System.out.println(i + " " + j);
        System.out.println(test(4));
    }

    static int test(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * test(--num);
            //注意这里和php不一样，因为优先级不同；
        }
    }
}
