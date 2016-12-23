package chapters13;

/**
 * @author by kissx on 2016/9/1.
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0)
                result.append(String.format("%05x: ", n));
            result.append(String.format("%02x ", b));
            ++n;
            if (n % 6 == 0)
                result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        //测试略

        /**
         * 下面为测试进制转换的代码
         */
        /*
        System.out.println(Integer.toBinaryString(3));
        Integer integer = Integer.valueOf("11", 2);
        System.out.println(integer);

        Integer.toBinaryString(17); //十进制转换为二进制
        Integer.toHexString(17);    //十进制转换为十六进制
        Integer.toOctalString(17);  //十进制转换为八进制
        Integer.valueOf("11", 2);   //二进制转换为十进制，其中“11”为原数，2表示二进制
        System.out.println(Integer.toBinaryString(17));
        System.out.println(Integer.toHexString(15));
        System.out.println(Integer.toOctalString(17));
        //*/

    }
}
